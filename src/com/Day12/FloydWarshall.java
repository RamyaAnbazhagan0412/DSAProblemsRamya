package com.Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class FloydWarshall {
final static int INF=99999;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int q=sc.nextInt();
		int[][] graph=new int[n][n];
		ArrayList<ArrayList<Integer>> query=new ArrayList<>();
		
		
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			graph[a-1][b-1]=c;
			graph[b-1][a-1]=c;
		}
		for(int i=0;i<q;i++) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			query.add(arr);
		}
		for(int i=0;i<query.size();i++) {
			for(int j=0;j<2;j++) {
				query.get(i).add(sc.nextInt());
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					graph[i][j]=0;
				}
				else if(graph[i][j]==0) {
					graph[i][j]=INF;
				}
			}
		}
		
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(graph[i][k]+graph[k][j]<graph[i][j]){
						graph[i][j]=graph[k][j]+graph[i][k];
					}
				}
			}
		}
		
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
			if(graph[k][i]==INF) {
				graph[k][i]=-1;
			}
			}
		}
  
		for(int k=0;k<q;k++) {
			for(int i=0;i<2-1;i++) {
			System.out.println(graph[query.get(k).get(i)-1][query.get(k).get(i+1)-1]);
			}

		}
	}
}


