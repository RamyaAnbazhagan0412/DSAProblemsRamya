package com.Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	String[] s=new String[N];
	for(int i=0;i<N;i++) {
		s[i]=sc.next();
	}
	int r=sc.nextInt();
	int c=sc.nextInt();
	ArrayList<ArrayList<Character>> adj=new ArrayList<>();
	for(int i=0;i<r;i++) {
		ArrayList<Character> arr=new ArrayList<>();
		adj.add(arr);
		for(int j=0;j<c;j++) {
		adj.get(i).add(sc.next().charAt(0));
		}
	}
	
	for(int i=0;i<N;i++) {
		isContain(s[i],r,c,adj);
	}

	}
	public static void isContain(String s,int r,int c,ArrayList<ArrayList<Character>> ch ) {
		int count=0;
		for(int k=0;k<s.length();k++) {
			for(int i=0;i<ch.size();i++) {
				for(int j=0;j<ch.get(i).size();j++) {
					if(s.charAt(k)==ch.get(i).get(j)) {
						count++;	
						ch.get(i).remove(j);
					}
				}
			}
			if(count==s.length()) {
				System.out.print(s+" ");
		
			break;
			}
	}
	}

}
