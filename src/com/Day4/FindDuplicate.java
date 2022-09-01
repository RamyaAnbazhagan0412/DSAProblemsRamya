package com.Day4;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(arr[4]==arr[4-1]) {
			System.out.print(arr[4]);
		}
		else if(arr[4]==arr[5]) {
			System.out.print(arr[4]);
		}
		else {
			System.out.print(arr[5]);
		}

	}

}
