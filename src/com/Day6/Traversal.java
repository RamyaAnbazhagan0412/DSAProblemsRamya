package com.Day6;

import java.util.Scanner;

public class Traversal {
	Node root;
	public static void insertNode(Node nodeToInsert,Node rootNode) {
			
			if(rootNode.left==null) {
				rootNode.left=nodeToInsert;
				System.out.println("inserted"+nodeToInsert.data+" to the left of the "+rootNode.data);
			}
			else {
				insertNode(nodeToInsert,rootNode.left);
			}
			
			if(rootNode.right==null) {
				rootNode.right=nodeToInsert;
				System.out.println("inserted"+nodeToInsert.data +" to the right of the "+rootNode.data);
			}
			else {
				insertNode(nodeToInsert,rootNode.right);
			}

		}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 Node root=new Node(n);
	}

}
