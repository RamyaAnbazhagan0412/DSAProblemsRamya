
package com.Day7;
import java.util.*;

class Node{
	
	 int v;
	 Node l;
	 Node r;
	public Node(int v) {
		this.v = v;
		this.l = null;
		this.r = null;
	}
}

public class BinaryTree {
	int v ;
	int ans ;
	
	public BinaryTree(int v, int ans2) {
		this.v=v;
		this.ans=ans2;
	}
	static ArrayList<BinaryTree> list = new ArrayList<>();
	public static void main(String[] args) {
		 Node root = getNode(1);
	        root.l = getNode(3);
	        root.r = getNode(5);
	        root.l.l = getNode(6);
	        root.l.r = getNode(9);
	        root.r.l = getNode(4);
	        root.r.r = getNode(8);
	 
	        max(root);
	        System.out.println(result());
	}

	private static Node getNode(int i) {
		Node newNode = new Node(i);  
		return newNode;
	}

	private static void max(Node root) {
		if(root.l!=null) {
			max(root.l);
			}
			if(root.r!=null) {
				max(root.r);
			}
		if(root.l!=null && root.r!=null) {
		int ans = root.l.v*root.r.v;
		BinaryTree nodes = new BinaryTree(root.v,ans);
		list.add(nodes);
		}
		

		
	}

	private static int result() {
		int max = 0;
		int ans = 0;
		for(BinaryTree node : list) {
			if(ans < node.ans) {
				ans=node.ans;
				max = node.v;
			}
		}
		
		return max;
	}

	
	
}