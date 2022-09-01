package com.Day8;

import java.util.HashMap;
import java.util.Scanner;

public class NutsBolts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] nut=new String[n];
		String[] bolt=new String[n];
		for(int i=0;i<n;i++) {
			nut[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			bolt[i]=sc.next();
		}
		HashMap<String,String> h=new HashMap<String,String>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(bolt[i].equalsIgnoreCase(nut[j])) {
				   h.put(bolt[i],nut[j]);
				   break;
				}
			}
		}
		System.out.println(h.keySet());
		
		System.out.println(h.values());
       for(int i=0;i<h.size();i++) {
   	   System.out.println(h.get(i));
       }
		
			
	}

}
