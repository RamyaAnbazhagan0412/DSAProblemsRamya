package com.Day11;

import java.util.Scanner;

public class GameTurn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int V=sc.nextInt();
		String[] road=new  String[4];
		for(int i=0;i<4;i++) {
		road[i]=sc.next();	
		}
	}
	public static void  command(int M,int V,String[] s) {
		int speed=0;
		int r1=0;
		for(int i=0;i<s.length;i++) {
			boolean[] b=new boolean[M];
			for(int b1=0;b1<M;b1++) {
				b[b1]=true;
			}
		 for(int k=0;k<s[i+1].length();k++){
			for(int j=0;j<s[i].length();j++){
					if(s[r1].charAt(j)=='.' && s[r1].charAt(j+1)=='.' && b[k]==true) {
							speed++;
						}
					else if(s[r1].charAt(j)=='.' && s[r1].charAt(j+1)=='0' && b[k]==true) {
					        
						 }
			}
		}
	}
	}
	}
