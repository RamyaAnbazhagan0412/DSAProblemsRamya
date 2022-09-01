package com.Day2;

public class CountOfString {

	public static void main(String[] args) {
	StringBuffer str1= new StringBuffer();
	str1.append("try");
			
	StringBuffer str2= new StringBuffer();
	str2.append("toy");
	System.out.println(str1);
	System.out.println(str2);
	for(int i=0;i<str1.length()-1;i++) {
		if(str2.charAt(i)!=str1.charAt(i)) {
		              str1.insert(i, str2.charAt(i));
		}
		
	}
	for(int i=0;i<str2.length()-1;i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			 str2.insert(i, str1.charAt(i));
		}
	}
	System.out.println(str1);
	System.out.println(str2);
	}}
