package com.Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoccerPlayers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr1.add(sc.nextInt());
		}
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			arr2.add(sc.nextInt());
		}
       int b=Collections.min(arr1)-Collections.min(arr2);
	 if(b<0) {
		 b=(2*b)-b;
		 System.out.print(b);
		 }
	 else {
		 System.out.print(b);
	 }
		
	}

}
