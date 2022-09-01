package com.Day7;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		LinkedList<Integer> l=new LinkedList<Integer>();
		int n=sc.nextInt();
		for(int  i=0;i<n;i++) {
			l.add(sc.nextInt());
		}
		int pos=sc.nextInt();
		if(pos>=0 && pos<l.size()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		sc.close();
	}
}
