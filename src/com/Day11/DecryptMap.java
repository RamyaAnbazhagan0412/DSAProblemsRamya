package com.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecryptMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=2;
		String[] s=new  String[2];
	  for(int i=0;i<a;i++) {
		s[i]=sc.next();
	   }
	  for(int i=0;i<a;i++) {
		  decrypt(s[i]);
		   }

	}
	public static void decrypt(String s) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Character> arr=new ArrayList<>();
		for(int i=0;i<s.length()-1;i++) {
			
			if(!arr.contains(s.charAt(i))) {
				int  count=1;
				arr.add(s.charAt(i));
			
		
			for(int j=i+1;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			a.add(count);
			}
			
		}
		Collections.sort(a);
		
		int b=a.get(a.size()-1)-a.get(0);
		StringBuffer s1=new StringBuffer();
		if(s.charAt(s.length()-1)=='s') {
		s1.append("South");
		}
		else if(s.charAt(s.length()-1)=='n') {
			s1.append("North");
			}
		else if(s.charAt(s.length()-1)=='w') {
			s1.append("West");
			}
		else if(s.charAt(s.length()-1)=='e') {
			s1.append("East");
			}
		
		System.out.print(b+" "+s1.toString()+" ");
	}
}
