package com.Day13;

import java.util.HashMap;
import java.util.Scanner;

public class DishesProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int[] arr=new int[n];
					
		}

	}
	public static void dishType(int n,int[] arr) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j] && arr[i]==arr[j-1]) {
					continue;
				}
			    if(arr[i]==arr[j+1] && arr[i]==arr[j-1]) {
					count++;
				}
			}
		}
	}

}
