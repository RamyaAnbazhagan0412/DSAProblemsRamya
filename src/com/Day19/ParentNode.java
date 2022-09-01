package com.Day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

class Node{
	public int data;
	public Node left;
	public Node right;
  public Node(int data) {
	  this.data=data;
	  this.left=null;
	  this.right=null;
  }
}
public class ParentNode {
      static  ArrayList<Integer>  arr=new ArrayList<Integer>();
	static TreeMap<Integer,Integer> h=new TreeMap<>();
	public static void main(String[] args) {
	 Node root;
	 Node first=new Node(1);
	 Node second=new Node(3);
	 Node third=new Node(5);
	 Node fourth=new Node(4);
	 Node fifth=new Node(8);
	 Node sixth=new Node(6);
	 Node seventh=new Node(9);
	 root=first;
	 first.left=second;
	 second.left=fourth;
	 third.right=seventh ;
	 first.right=third;
	 second.right=fifth;
	 third.left=sixth;
	 
	 post(root);
	 System.out.println(h.get(h.lastKey()));

	}
	
	public static void post(Node root) {
		if(root==null) {
			return;
				}
		int a=0;
		if(root.left!=null && root.right!=null) {
		  a=root.left.data*root.right.data;
		  h.put(a, root.data);
		}
		post(root.left);
		post(root.right);	
	}
}

