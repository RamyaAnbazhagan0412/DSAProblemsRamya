package com.Day7;

import java.util.ArrayList;

public class TravellingSalesmanProblem {

	public static void main(String[] args) {
		int r=4;
		int c=4;
		int[][] a=new int[][] {{0,10,15,20},
			{10,0,35,25},
			{15,35,0,30},
			{20,25,30,0}};
			int[] sum=new  int[r];
			
			ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
			for(int i=0;i<r;i++) {
				ArrayList<Integer> arr=new ArrayList<Integer>();
				adj.add(arr);
			}
			adj.get(0).add(1);
			adj.get(0).add(3);
			adj.get(0).add(2);
			adj.get(1).add(3);
			adj.get(1).add(2);
			adj.get(1).add(0);
			adj.get(3).add(0);
			adj.get(3).add(1);
			adj.get(3).add(2);
			adj.get(2).add(0);
			adj.get(2).add(1);
			adj.get(2).add(3);
			
			System.out.print(adj.toString());
			
			for(int i=0;i<r*c-2;i++) {
				int sum1=0;
				for(int j=0;j<r;j++) {
					if(adj.get(j).contains(j+1)) {
						sum1+=a[j][j+1];
						continue;
					}
				}
				sum[i]=sum1;
			}
			
int j=0;
		int min=sum[0];
		for(int  i=1;i<r;i++) {
			if(sum[i]<min) {
				min=sum[i];
			j=i;
			}
		}
	
		
	}

}
