package com.Day17;

import java.util.Scanner;

public class StringMinEdition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		s1.append(sc.next());
		s2.append(sc.next());
		int count=0;
		if(s1.length()>s2.length()){
			int j=0;
			while(s1.length()>s2.length()) {
			if(s1.charAt(j)!=s2.charAt(j)) {
				s1.deleteCharAt(j);
				count++;
			}
			j++;
			}
		}
		else  if(s1.length()<s2.length()){
			int j=0;
			while(s1.length()<s2.length()) {
			if(s1.charAt(j)!=s2.charAt(j)) {
				s1.insert(j, s2.charAt(j));
				count++;
			}
			j++;
			}
		}
		 if(s1.length()==s2.length()) {
			 for(int i=0;i<s2.length();i++) {
				 StringBuffer s=new  StringBuffer();
				 s.append(s2.charAt(i));
				 if(s1.charAt(i)!=s2.charAt(i)) {
					 s1.replace(i, i+1,s.toString());
					 count++;
				 }
			 }
		 }
		 
		System.out.print(count);
	}
}
