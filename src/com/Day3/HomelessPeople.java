package com.Day3;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class HomelessPeople {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] PArray=new int[N];
		int[] HArray=new int[N]; 
		
		for(int i=0;i<N;i++) {
			PArray[i]=sc.nextInt();
			
		}
		for(int i=0;i<N;i++) {
			HArray[i]=sc.nextInt();
			
		}
	System.out.println(home(N,PArray,HArray));
	}
	public static int  home(int n,int p[],int h[]) {
		int count=0;
		LinkedHashMap<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
			  if(h[j]>p[i])
			  {
				  m.put(h[j], p[i]);
				  break;
			  }
			  else if(h[i]<p[j]){
				  continue;
			  }
				
			}
			
		}
		count=n-m.size();
		return count;
	}

}
