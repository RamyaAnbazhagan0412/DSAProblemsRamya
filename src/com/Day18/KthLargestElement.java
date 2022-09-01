package com.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++) {
		ar[i]=sc.nextInt();
	}
	int l=sc.nextInt();
	ArrayList<Integer> alist=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			int sum=0;
			for(int k=i;k<=j;k++) {
				sum+=ar[k];
			}
			alist.add(sum);
		}
	}
	Collections.sort(alist,Collections.reverseOrder());
	System.out.print(alist.get(l-1));
	}

}
