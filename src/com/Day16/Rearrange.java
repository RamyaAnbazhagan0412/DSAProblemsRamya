package com.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int i=n/2;i<n;i++) {
			arr2.add(arr.get(i));
		}
		int a=arr.size()/2-1;
		for(int i=0;i<arr.size()/2;i++) {
			arr2.add(i+2+i, arr.get(a));
			a--;
		}
		for(int i=0;i<arr2.size();i++
				){
				System.out.print(arr2.get(i)+" ");
				}
	
	}
}
