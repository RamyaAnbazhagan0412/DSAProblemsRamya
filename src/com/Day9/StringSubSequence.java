package com.Day9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSubSequence {
	static ArrayList<Integer> h=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		subSequence(s,k);

	}
	public static void subSequence(String s,int k) {
      for(int i=0;i<s.length();i++) {
    	  int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
				int ascii=s.charAt(i);
				if(count>=2) {
						h.add(ascii);
				}
			}
		}
      }
      Collections.sort(h);
      int y=h.size();
      int a=(h.get(y-1));
      char c=(char)a;
      for(int i=1;i<=y-1;i++) {	  
    	  if(h.get(y-i)==h.get(y-1-i)){
    		  System.out.print(c); 
    	  }
      }
      
	}
}
