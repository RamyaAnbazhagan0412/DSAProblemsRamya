package com.Day12;
import java.util.Scanner;
public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sqrt=(int) (Math.pow(n,2));
		StringBuffer s=new StringBuffer();
		s.append(sqrt);
		int a=s.length()/2;
		String s1=s.substring(0, a);
		String s2=s.substring(a, s.length());

		int b=Integer.valueOf(s1)+Integer.valueOf(s2);
		if(s1!="0" && s2!="0" && b==n) 
			System.out.print("Yes");
		else 
	
		
			[''['']
					['[;//;p''[/]
			 System.out.print("No");	
	}
}
