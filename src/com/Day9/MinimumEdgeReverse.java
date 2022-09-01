package com.Day9;

import java.util.ArrayList;


public class MinimumEdgeReverse {

	public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int v=7;
        for(int i=0;i<v;i++) {
        	ArrayList<Integer> arr=new ArrayList<Integer>();
        	adj.add(arr);
        }
        int s=0;
        int d=6;
        adj.get(0).add(1);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(4).add(5);
        adj.get(5).add(1);
        adj.get(6).add(3);
        adj.get(6).add(4);
        
      
//System.out.println(adj);
int rev=0;
for(int i=s;i<d;i++) {
	if(adj.get(i).contains(i+1)) {
		continue;
	}
	else if(!adj.get(i).contains(i+1)) {
	for(int j=i+1;j<v;j++) {
		if(adj.get(j).contains(i)) {
			adj.get(i).add(j);
			//System.out.println(j);
			adj.get(j).remove(adj.get(j).indexOf(i));

			rev++;
			break;
		}
	}
	}
}
//System.out.print(adj);
System.out.println(rev);

	}

}
