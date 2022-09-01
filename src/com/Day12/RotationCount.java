package com.Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			l.add(sc.nextInt());
		}
		int count=0;
//		for(int i=0;i<n;i++) {
//	
//			if(l.get(0)>l.get(n-1)) {
//				int a=l.remove(0);
//				l.add(n-1, a);
//				count++;
//			}
//		}
		
		while(l.get(0)>l.get(n-1)) {
			
			if(l.get(0)>l.get(n-1)) {
				int a=l.remove(0);
				l.add(n-1, a);
				count++;
			}
		}
	
		System.out.print(count);
	}

}
