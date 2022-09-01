package com.Day5;


public class TrieNode {
	  static int alphabetSize=26;
	 TrieNode[] children = new TrieNode[ alphabetSize];
     
     // isEndOfWord is true if the node represents
     // end of a word
     boolean isEnd;
     
     TrieNode(){
         isEnd = false;
         for (int i = 0; i <  alphabetSize; i++)
             children[i] = null;
     }
	
}




