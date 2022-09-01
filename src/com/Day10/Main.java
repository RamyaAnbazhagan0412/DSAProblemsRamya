package com.Day10;
import java.util.ArrayList;
import java.util.Collections;
//
//import java.util.Scanner;
//
//public class Print256Day {
//
//public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//int year=sc.nextInt();
//int tofind=256;
//int m=256/30;
//int day=0;
//if((year%4==0 || year%400==0) && year%100!=0) {
//	day=tofind -(30*2+31*5+29);
//	}
//	else {
//		day=tofind -(30*2+31*5+28);
//}
//if(year==1918) {
//	System.out.println((day+13)+"."+(m+1)+"."+year);
//}
//else
//System.out.println(day+"."+(m+1)+"."+year);
//}
//}s
public class Main{
	public static void main(String[] args ) {
		int n=3;
		String a="0001110000110000011000000001100001100100";
		int k=5;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='1') {
				for(int j=1;j<=k;j++) {
					int b=(i+1)*j;
					if(!arr.contains(b)) {
					arr.add(b);
					}
						}
					
			}
		}
	Collections.sort(arr);
	System.out.println(arr.get(k-1));
		//System.out.println(arr.get(k-1));
	}
}