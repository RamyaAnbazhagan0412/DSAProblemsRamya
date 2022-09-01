package com.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayComposite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int j=0;j<n;j++) {
		String s=String.valueOf(arr[j]);
		//System.out.println(s);
		ArrayList<Character> c=new ArrayList<>(); 
		int a=1;
		for(int i=0;i<s.length();i++) {
		c.add(s.charAt(i));
		//System.out.print(c);
		a*=Character.getNumericValue(c.get(i));
		}
		if(a%2==0) {
	    al.add(a);
		}
		}
		int b= al.indexOf(Collections.max(al));
		
		System.out.print(arr[k-1]);
	}
}
