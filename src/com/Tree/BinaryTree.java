package com.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class TreeNode{
	public TreeNode left;
	public TreeNode right;
	public int data;
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
}
public class BinaryTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
	     TreeNode root;
		TreeNode first=new TreeNode(5);
		TreeNode second=new TreeNode(6);
		TreeNode third=new TreeNode(7);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(2);
	     root=first;
	     first.left=second;
	     first.right=third;
	     second.left=fourth;
	     second.right=fifth;
	     preOrder(root);
	     System.out.println();
	     InOrder(root);
	     System.out.println();
	     postOrder(root);
	     System.out.println();
	     level(root);
	     System.out.println();
	     levelOrder(root);
	     System.out.println();
	     System.out.println(max(root));
       System.out.println();
       depth(root);
	     
	}
	public static void preOrder(TreeNode root) {
		if(root==null) {
			return;
			
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void InOrder(TreeNode root) {
		if(root==null) {
			return;
			
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public static  void postOrder(TreeNode root) {
		if(root==null) {
			return;
	
		}
	   postOrder(root.left);
	   postOrder(root.right);
	   System.out.print(root.data+" ");
	}

   public static void level(TreeNode root) {
	   if(root==null) {
	   return;
			 }
	   ArrayDeque<TreeNode> al=new ArrayDeque<>();
	   al.addLast(root);
	   while(!al.isEmpty()) {
		   TreeNode node=al.removeFirst();
		   System.out.print(node.data+" ");
		   if(node.left!=null) 
		   {
			   al.addLast(node.left);
			   
		   }
		   if(node.right!=null) 
		   {
			   al.addLast(node.right);
			   
		   }
	   }
	   
   }
   public static void levelOrder(TreeNode root) {
	   if(root==null) {
	   return;
			 }
	   Queue<TreeNode> al=new LinkedList<>();
	   al.offer(root);
	   while(!al.isEmpty()) {
		   TreeNode node=al.poll();
		   System.out.print(node.data+" ");
		   if(node.left!=null) 
		   {
			   al.offer(node.left);
			   
		   }
		   if(node.right!=null) 
		   {
			   al.offer(node.right);
			   
		   }
	   }
   }
   public static int max(TreeNode root) {
	   if(root==null) {
		   return Integer.MIN_VALUE;
	   }
	  
	   int result=root.data;
	   System.out.println(result);
	   
	   int left=max(root.left);
	   System.out.println(left);
	  
	   int  right=max(root.right);
	   System.out.println(right);
	   if(left>result) {
		   result=left;
	   }
	   if(right>result) {
		   result=right;
	   }
	   return result;
   }
   public static  void depth(TreeNode root) {
	   if(root==null) {
		   return ;
	   }
	   Stack<TreeNode> st=new Stack<>();
	   st.push(root);
	   while(!st.isEmpty()) {
		   TreeNode node=st.pop();
		   System.out.print(node.data+" ");
		   if(node.right!=null) {
			   st.push(node.right);
		   }

		   if(node.left!=null) {
			   st.push(node.left);
			   
		   }
		   	   }
	   
   }
}
