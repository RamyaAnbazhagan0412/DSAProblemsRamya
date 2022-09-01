package com.Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UglyNumber {
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int i=1;
		arr.add(1);
		while(i<=n) {
			if(i==1 || i==2 || i==5 || i%2==0) {
               add(i);
			}
			else{
	          	if(isPrime(i)==false) {
	          		add(i);
	          	}				
			}
			i++;
		}
		Collections.sort(arr);
		System.out.print(arr.toString());
		System.out.print(arr.get(n-1));
	}
	public static void add(int i) {
		 int a=i*2;
         int b=i*3;
         int c=i*5;
         if(!arr.contains(a))
			arr.add(a);
         if(!arr.contains(b))
				arr.add(b);
         if(!arr.contains(c))
				arr.add(c);
	}
	public static boolean isPrime(int i) {
		boolean b=false;
		if(i==2 && i==3 ) {
			b=true;
		}
		else {
for(int j=2;j<=i/2;j++) {
	if(i%j!=0) {
		b=true;
	}
	else {
		b=false;
		break;
	}
}		
	    }
		return b;
	}
}
