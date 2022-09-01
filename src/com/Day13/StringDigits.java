package com.Day13;

import java.util.Scanner;

class Goodnodes {
	static class Node {
		int val;
		Node left, right;
          Node(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
static int tree(Node root, int m) {
		if (root == null)
			return 0;
		int currentnode = 0;
		if (m <= root.val)
			currentnode++;
		m = Math.max(m, root.val);
		return tree(root.left, m) + tree(root.right, m) + currentnode;
	}

	public static int goodNodes(Node root) {
		int m = Integer.MIN_VALUE;
		return tree(root, m);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = new Node(n);
		
			root.left = new Node(sc.nextInt());

		System.out.println(goodNodes(root));
	}

}