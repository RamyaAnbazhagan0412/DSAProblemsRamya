package com.Day3;

import java.util.Scanner;

public class NobelPrizeWinning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int count=0;
		for(int i=x;i<=n;i++) {
			for(int j=y+1;j<=m;j++) {
				if(x==n && y==m) {
					break;
				}
				else {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
