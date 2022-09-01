package com.Day13;

import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;

	}
}

public class BinarySearchTree {

	public static void insertNode(Node nodeToInsert, Node rootNode) {
		if (nodeToInsert.data < rootNode.data) {

			if (rootNode.left == null) {
				rootNode.left = nodeToInsert;
				System.out.println("inserted" + nodeToInsert.data + " to the left of the " + rootNode.data);
			} else {
				insertNode(nodeToInsert, rootNode.left);
			}
		} else {
			if (rootNode.right == null) {
				rootNode.right = nodeToInsert;
				System.out.println("inserted" + nodeToInsert.data + " to the right of the " + rootNode.data);
			} else {
				insertNode(nodeToInsert, rootNode.right);
			}

		}
	}

	public static void preOrder(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		System.out.println(rootNode.data);
		preOrder(rootNode.left);
		preOrder(rootNode.right);
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the root node");
			
			String s1=sc.next();
			int data = Integer.valueOf(s1);
			Node rootNode = new Node(data);
			System.out.println("enter number of node you want to enter");
			int n= sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter node value");
				String s=sc.next();
				int d = Integer.valueOf(s);
				Node nodeToInsert=new Node(d);
				BinarySearchTree.insertNode(nodeToInsert, rootNode);
			}
			
			System.out.println("PreOrder Traversal");
			BinarySearchTree.preOrder(rootNode);
		}
}