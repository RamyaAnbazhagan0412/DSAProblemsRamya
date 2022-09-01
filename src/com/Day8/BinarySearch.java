package com.Day8;

import java.util.Scanner;

class Node{
	static int  val;
	Node left;
	Node right;
	public Node(int data) {
		this.val=data;
		this.left=null;
		this.right=null;
	}
}



public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++) {
		
		int N=sc.nextInt();
		Node root=null;
		for(int i=0;i<N;i++) {	
			int y=sc.nextInt();
		root=insert(y,root);
		}
		System.out.print(min(root));
		}

	}
	public static Node insert(int toInsert,Node root) {
		
			if(root==null && toInsert>0) {
				return new Node(toInsert);
			}
			else {
				if(root.val>toInsert && toInsert>0) {
					root.left=insert(toInsert,root.left);
				}else{
					root.right=insert(toInsert,root.right);
				}
			}
		return root;
		
	}
	public static int  min(Node root) {
		int min=0;
		if(root.left!=null) {
			min=min(root.left);
			
		}
		else {
		min=root.val;
		}
		
		return min;
	}
	
}
