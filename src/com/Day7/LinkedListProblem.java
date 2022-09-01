package com.Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListProblem {
		static Node node ;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			ArrayList<Node> nodes = new ArrayList<>();
			Node head = null;
			for(int i=0;i<n;i++) {
				head = insert(head,sc.nextInt());
				nodes.add(head);
			}
			int pos = sc.nextInt(); 
			try {
     		nodes.add(head.ptr=(nodes.get(pos)));
			int c = search(nodes,head);
			if(c==0){
				System.out.println("false");
			}else {
				System.out.println("true");
			}
			}
			catch(Exception e) {
				System.out.println("false");
			}
		}

		private static int search(ArrayList<Node> nodes, Node head) {
			int count =0;
			for(Node node: nodes) {
				if(node==head.ptr) {
					count ++;
				}
			}
			return count;
			
		}

		private static Node insert(Node head,int val) {
			if(head == null) {
				head = new Node(val);
				return head;
			}
			else {
				head = insert(head.ptr,val);	
			}
			return head;
		}
	}
