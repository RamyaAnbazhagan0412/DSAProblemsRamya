package com.Day3;

import java.util.Scanner;

public class SelfSufficient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] EarnArray=new int[N];
		int[] CostArray=new int[N]; 
		
		for(int i=0;i<N;i++) {
			EarnArray[i]=sc.nextInt();
			
		}
		for(int i=0;i<N;i++) {
			CostArray[i]=sc.nextInt();
			
		}
		System.out.println(balance(N,EarnArray,CostArray));
		
	}
	public static int  balance(int N,int E[],int C[]) {
		int store=0;
		int parents=0;
		for(int i=0;i<N;i++) {
			if(C[i]>E[i]) {
				if(store!=0) {
					parents=parents-store;
				}
				parents=parents+(C[i]-E[i]);
			}
			else if(C[i]<E[i]) {
				store=store+(E[i]-C[i]);
			}
			
		}
		return parents;
	}

}
//for(int i=0;i<N;i++) {
//	EarnArray[i]=sc.nextInt();
//	earnings=earnings+EarnArray[i];
//}
//for(int i=0;i<N;i++) {
//	CostArray[i]=sc.nextInt();
//	costs=costs+CostArray[i];
//}
//int parents=costs-earnings;
//System.out.println(parents);
