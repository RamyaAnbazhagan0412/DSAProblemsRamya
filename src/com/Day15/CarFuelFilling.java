package com.Day15;

import java.util.Scanner;

public class CarFuelFilling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int fuel=sc.nextInt();
		// no of station;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int count=1;
		int sum=0;
		if(fuel<arr[0][0]) {
			System.out.print(-1);
		}
		else if(arr.length==0) {
			System.out.print(0);
		}

		while(target>=sum && fuel>=arr[0][0]) {
			count++;
			for(int i=0;i<row-1;i++) {
				for(int j=0;j<col-1;j++) {
					if(fuel>=arr[i][j]) {
					fuel-=arr[i][j];
					sum+=arr[i+1][j];
					}
					else {
						break;
					}
				}
			}
			
			
		}
		System.out.print(count);

	}

}
