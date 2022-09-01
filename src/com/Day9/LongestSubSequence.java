package com.Day9;

import java.util.ArrayList;

public class LongestSubSequence {
	  static ArrayList<StringBuffer>  arr=new ArrayList<>();
	public static void main(String[] args) {
       int[] a= {5,3,9,3,4,7};
       subArray(a);
       System.out.print(arr);

	}
	public static void subArray(int[] sub) {
		for(int i=0;i<sub.length;i++) {
			for(int j=i;j<sub.length;j++) {
				StringBuffer s=new  StringBuffer();
				for(int k=i;k<=j;j++) {
					 s.append(k);
				}
			   arr.add(s);
			}  
		}
	}

}
