package com.Day13;

import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] triplets=new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				triplets[i][j]=sc.nextInt();
			}
		}
		int[] target=new int[3];
		for(int i=0;i<3;i++) {
			target[i]=sc.nextInt();
		}
		int count=0;
					for(int j=0;j<3;j++) {
						for(int k=0;k<n;k++) {
					    if(triplets[k][j]==target[j]) {
					    	count++;
					    	break;
					    }    
				}
			}
			if(count==3)
		System.out.println("true");
			else
				System.out.println("false");
				
		
		
		
	}

}
