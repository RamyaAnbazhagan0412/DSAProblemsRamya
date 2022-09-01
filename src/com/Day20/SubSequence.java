package com.Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubSequence {
static ArrayList<Integer> arr=new ArrayList<>();
static int count=0;
static String s3="";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		subSequence(s);
		Collections.sort(arr);
		System.out.println(arr.toString());
	System.out.println(count);
	System.out.println(s3);
		

	}
	
	public static void subSequence(String s,String subSeq) {// 2^n-1
		if(s.equals("")) {
			StringBuffer s1=new StringBuffer();
			s1.append(subSeq);
			count++;
			if(subSeq.equals(s1.reverse().toString()) ) {
				if(s3.length()<subSeq.length()) {
					s3=subSeq;
				}
			arr.add(subSeq.length());

			}
			
			System.out.println(subSeq);
			return;
		}
		subSequence(s.substring(1),subSeq+s.charAt(0));
		subSequence(s.substring(1),subSeq);
	}
	public static void subSequence(String s) {
		subSequence(s,"");
	}

}
