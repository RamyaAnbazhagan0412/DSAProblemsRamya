package com.Tree;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;


class TrNode{
	public TrNode left;
	public TrNode right;
	int data;
	public TrNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinarySearchTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TrNode root=new TrNode(sc.nextInt());
		int noOfTrNodes=sc.nextInt();
		for(int i=0;i<noOfTrNodes;i++) {
			TrNode TrNode=new TrNode(sc.nextInt());
			insert(TrNode,root);
			
		}
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		LevelOrder(root);
		System.out.println();
		df(root);
		System.out.println();
		max(root);
		min(root);

	}
	public static  void insert(TrNode insertTrNode,TrNode rootTrNode) {
		if(insertTrNode.data<rootTrNode.data) {
		if(rootTrNode.left==null) {
			rootTrNode.left=insertTrNode;
		}
		else {
			insert(insertTrNode,rootTrNode.left);
		}
		}
		else if(insertTrNode.data>rootTrNode.data) {
		if(rootTrNode.right==null) {
			rootTrNode.right=insertTrNode;
		}		
		else {
			insert(insertTrNode,rootTrNode.right);
		}
		}
	}
	public static void preOrder(TrNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void  inOrder(TrNode root)
	{
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}	
	public static void postOrder(TrNode root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static void LevelOrder(TrNode root) {
		ArrayDeque<TrNode> ar=new ArrayDeque<>();
		ar.addLast(root);
		while(!ar.isEmpty()) {
			TrNode node=ar.removeFirst();
			System.out.print(node.data+" ");
			if(node.left!=null) {
				ar.addLast(node.left);
			}
			if(node.right!=null) {
				ar.addLast(node.right);
			}
		}
	}
	public static void df(TrNode  root) {
		Stack<TrNode> st=new Stack<>();
		st.push(root);
		while(!st.isEmpty()) {
			TrNode node=st.pop();
			System.out.print(node.data+ " ");
			if(node.right!=null) {
				st.push(node.right);
			}
			if(node.left!=null) {
				st.push(node.left);
			}
		}
	}
	
	public static void max(TrNode root)
	{
		
		int result=root.data;
		if(root.right==null) {
		System.out.println(result);
		}
		else
		max(root.right);
	}
	public static void min(TrNode root) {
		int result=root.data;
		if(root.left==null) {
			System.out.print(result);
		}
		else {
			min(root.left);
		}
	}
}
