package com.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DeptFirstSearch {
	public static void main(String[] args) {
	int[][] graph={
			{0,1,1,1,0,0},{1,0,0,0,1,0},{1,0,0,1,1,0},{1,0,1,0,0,1},{0,1,1,0,0,0},{0,0,0,1,0,0}
		};
		int v=6;
		int source=0;
		List<Integer> l=dpt(graph,source,v) ;
		for(Integer a:l) {
			System.out.println(a);
		}
		
}
	public static List<Integer> dpt(int[][] graph,int s,int v) {
		List<Integer> vis=new ArrayList<Integer>();
		Stack<Integer> st=new Stack<Integer>();
		st.push(s);
		while(vis.size()<v && st.isEmpty()==false) {
			int ver=st.pop();
			vis.add(ver);
			for(int i=0;i<v;i++) {
				if(graph[ver][i]!=0 && vis.contains(i)==false && st.contains(i)==false) {
					st.push(i);
				}
			}
		}
		return vis;
	}
}
