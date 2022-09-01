package com.Day11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BreathFirstSearch {

	public static void main(String[] args) {
	int[][] graph={
		{0,1,1,1,0,0},{1,0,0,0,1,0},{1,0,0,1,1,0},{1,0,1,0,0,1},{0,1,1,0,0,0},{0,0,0,1,0,0}
	};
	int v=6;
	int source=0;
	
	List<Integer> s=bfs(graph,source,v);
	for(Integer vertex:s) {
		System.out.println(vertex);
	}
	
	

	}
	public static  List<Integer> bfs(int[][] graph,int s,int v ){
		List<Integer> visited=new ArrayList<Integer>();
		ArrayDeque<Integer> que=new ArrayDeque<>();
		que.addLast(s);
		while(visited.size()<v && que.isEmpty()==false)
		{
			int vertex=que.removeFirst();
			visited.add(vertex);
			for(int i=0;i<v;i++) {
				if(graph[vertex][i]!=0 && que.contains(i)==false && visited.contains(i)==false) {
					que.addLast(i);
				}
				
			}
		}
		return visited;
	}

}
