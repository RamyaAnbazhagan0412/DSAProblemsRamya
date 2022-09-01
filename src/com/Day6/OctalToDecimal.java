package com.Day6;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		String a=String.valueOf(n);
		double sum=0;
		int d=0;
		for(int i=a.length()-1;i>=0;i--) {
			char b=a.charAt(i);
			int c=Character.getNumericValue(b);
			sum=sum+c*Math.pow(8,d);
			d++;
		} 
		System.out.println(Math.round(sum));
	}

}
