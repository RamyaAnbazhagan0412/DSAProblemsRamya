package com.Day6;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
		}
		System.out.print(count);	
		}
}
