       package com.Day13;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<String> arr=new ArrayList<String>();
	for(int i=0;i<n;i++) {
		arr.add(sc.next());
    }
	for(int i=0;i<arr.size();i++) {
		for(int j=i+1;j<arr.size();j++) {
		if(arr.get(i).equals(arr.get(j)) || arr.get(i).equals("null")) {
			arr.remove(i);
		}
		}
	}
	System.out.println(arr.size());
	//System.out.println(arr.toString());
	}

}

