package com.Day6;

import java.util.Scanner;

public class MonsterGame {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int exp=sc.nextInt();
			
			int monster[]=new int[n];
			int bonus[]=new int[n];
			for(int i=0;i<n;i++) {
				monster[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				bonus[i]=sc.nextInt();
			}
			boolean[] mPorA=new boolean[n];
			for(int i=0;i<n;i++) {
				mPorA[i]=true;
			}
			
		int count=0;
			int i=0;
			while(i<n ) {
				int j=0;
				while(j<n && mPorA[j]==true) {
				if(mPorA[j]==true && monster[j]<=exp)
				{
						exp+=bonus[j];
						mPorA[j]=false;
						count++;
						i++;
						System.out.println(count);
						break;
					}
					else if(monster[j]>exp && monster[j]<=exp) {
						j++;
						System.err.println(count);
						continue;
					}
					else {
						break;
					}
				}
				}
			
			System.out.println(count);

		}


}
