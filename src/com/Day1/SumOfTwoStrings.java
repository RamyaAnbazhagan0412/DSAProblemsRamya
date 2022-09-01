package com.Day1;

import java.text.DecimalFormat;

public class SumOfTwoStrings {
public static void main(String[] args) {
	String a="11";
	String d="1";
	String c=" ";
	DecimalFormat df=new DecimalFormat("00");
	String b=df.format(9);
	char carry='0';
	String one="1";
	String zero="0";
	for(int i=a.length()-1;i>=0;i--) {
		
		if((a.charAt(i)==1 && b.charAt(i)==0 && carry==0 )||( a.charAt(i)==0 && b.charAt(i)==1 && carry==0 )) {
			c=one;
			carry=0;
		}
		else if((a.charAt(i)==0 && b.charAt(i)==0 && carry==0) ||( a.charAt(i)==0 && b.charAt(i)==0 && carry==0)){
			c=zero;
			carry=0;
		}
		else if((a.charAt(i)==1 && b.charAt(i)==0 && carry==1 )||( a.charAt(i)==0 && b.charAt(i)==1 && carry==1 )) {
			c=zero;
			carry=1;
		}
		else if((a.charAt(i)==1 && b.charAt(i)==1 && carry==0 )||( a.charAt(i)==1 && b.charAt(i)==1 && carry==0 )) {
			c=zero;
			carry=1;
		}
		else if((a.charAt(i)==1 && b.charAt(i)==1 && carry==1) || (a.charAt(i)==1 && b.charAt(i)==1 && carry==1 )) {
			c=one;
			carry=1;
		}
		else if((a.charAt(i)==1 && b.charAt(i)==1 && carry==1) || (a.charAt(i)==1 && b.charAt(i)==1 && carry==1 )) {
			c=one;
			carry=1;
		}
		System.out.println(c);

	}
	
}
	
}
//else if((a.charAt(i)==' ' && b.charAt(i)==0 && carry==0) ||( a.charAt(i)==0 && b.charAt(i)==' ' && carry==0)){
//c="0";
//carry=0;
//}

//else if((a.charAt(i)==0 && b.charAt(i)==' ' && carry==1) ||( a.charAt(i)==' ' && b.charAt(i)==0 && carry==1 )) {
//c="1";
//carry=0;
//}

//else if((a.charAt(i)==1 && b.charAt(i)==' ' && carry==0) || (a.charAt(i)==' ' && b.charAt(i)==1 && carry==0 )) {
//c="1";
//carry=0;
//}
