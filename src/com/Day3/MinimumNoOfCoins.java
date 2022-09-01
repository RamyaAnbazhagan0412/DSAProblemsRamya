package com.Day3;

import java.util.Scanner;

public class MinimumNoOfCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V=sc.nextInt();
		int m=sc.nextInt();
		int[] C=new int[m];
		
		for(int i=0;i<m;i++) {
			C[i]=sc.nextInt();
			
		}
		if(V==0) {
			System.out.print(0);
		}
		else {
			System.out.print(min(C,V,m));
		}
	}
	public static int min(int c[],int v,int m) {
		int min=0;

		for(int i=0;i<m;i++) {
			int count=0; 
		for(int j=0;j<m;j++) {
			int x=c[i]+c[j];
			
			if(x==v) {
				count++;
			}
		}
		min+=count;
			}
		if(min==0) {
			min=-1;
		}
		return min;
	}

}
//public class MinimumNoOfCoins{
//	public static void main(String[] args) {
//     int a=0;
//     int n=4;
//     String s="1111";
//            for(int i=0;i<n;i++){
//                char b=s.charAt(i);
//                int x=b-'0';
//                a+= x*Math.pow(2,i);
//                System.out.println(a+=x*Math.pow(2,i));
//            }
//            if(a<=9){
//                System.out.println(a);
//            }
//}
//}
