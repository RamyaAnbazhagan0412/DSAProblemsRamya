package com.Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class MLA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		ArrayList<Integer> adj=new ArrayList<>();
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> arr1=new ArrayList<>();
			arr.add(arr1);
			adj.add(i);
		}
		for(int i=0;i<p;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr.get(a).add(b);
			arr.get(b).add(a);
		}
		ArrayList<String> pair=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			
			if(arr.get(i).size()>0) {
				
			for(int j=0;j<arr.get(i).size();j++) {
				
				for(int k=i+1;k<n;k++) {
					
					for(int l=0;l<arr.get(k).size();l++) {
						
						StringBuffer s=new StringBuffer();
						
					if(arr.get(k).get(l)!=i && arr.get(i).get(j)!=arr.get(k).get(l)) {
						s.append(arr.get(i).get(j));
						s.append(arr.get(k).get(l));
						
					}
					if(!pair.contains(s.toString()) && !pair.contains(s.reverse().toString())) {
						pair.add(s.toString()); 
					}
				}
			}
		}
			}
			}
		if(pair.contains(""))
		{
			pair.remove(pair.indexOf(""));
		}

     System.out.println(pair.size());

	}

}
