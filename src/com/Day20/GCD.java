package com.Day20;

public class GCD {

	public static void main(String[] args) {

int a=6;
int b=12;
int c= GCD(a,b);
System.out.print(c);
	}
	public static int GCD(int a,int b ) {
		int g,s ,r;
		if(a>b) {
			g=a;
			s=b;
		}
		else {
			g=b;
			s=a;
		}
		r=g%s;
		if(r==0) {
			return s;
		}
		
		return GCD(s,r);
	} 

}
