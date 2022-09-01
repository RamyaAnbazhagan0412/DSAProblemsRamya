package com.Day5;
import java.util.Scanner;

public class Trie 
{
	static TrieNode root;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Array Size:");
		int N = sc.nextInt();
		String[] str = new String[N];
		System.out.println("Enter the " + N + " String: ");
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		System.out.println("Enter the Search Element: ");
		String search = sc.next();

		root = new TrieNode();

		for (int i = 0; i < str.length; i++) {
			insert(str[i]);
		}

		if (search(search) == true)
			System.out.println(1);
		else
			System.out.println(0);

	}

	public static void insert(String str) {

		int index;

		TrieNode pCrawl = root;

		for (int i = 0; i < str.length(); i++) {
			index = str.charAt(i) - 'a';
			if (pCrawl.children[index] == null)
				pCrawl.children[index] = new TrieNode();

			pCrawl = pCrawl.children[index];
		}

		pCrawl.isEnd = true;
	}

	public static boolean search(String str) {

		int index;
		TrieNode pc = root;

		for (int i = 0; i < str.length(); i++) {
			index = str.charAt(i) - 'a';

			if (pc.children[index] == null)
				return false;

			pc = pc.children[index];
		}

		return (pc.isEnd);
	}

}