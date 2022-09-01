package com.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectedUnConnectedGraph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
Scanner sc=new Scanner(System.in);
		int v=4;
		int e=3;
		for(int i=0;i<v;i++) {
			ArrayList<Integer> arr=new ArrayList<>();
			adj.add(arr);                                       
		}
		for(int i=0;i<e;i++) {
			adj.get(sc.nextInt()).add(sc.nextInt());       
		}
		
//		adj.get(0).add(3);
//		adj.get(0).add(2);
//		adj.get(0).add(1);
		int dep=0;
		for(int i=0;i<v;i++) {
			dep=dep+adj.get(i).size();
			System.out.println(adj.get(i));                                       
		}
		System.out.println(dep);

	}

}
