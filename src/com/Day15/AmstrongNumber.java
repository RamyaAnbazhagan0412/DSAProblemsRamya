package com.Day15;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int ans=0;
		int n=n1;
		while(n>0){
			int l=n%10;
			n=n/10;
			ans+=l*l*l;		
		}
		System.out.println(ans);
		if(ans==n1) {
		System.out.println("Amstrong number");
		}
		else {
			System.out.println("not a Amstrong number");
			}
	}
	

}
