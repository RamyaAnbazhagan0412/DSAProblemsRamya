package com.Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class Compare {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
ArrayList<String> s=new ArrayList<String>();
for(int i=0;i<n;i++) {
	s.add(sc.next());
}

ArrayList<String> s1=new ArrayList<String>();
for(int i=0;i<m;i++) {
	s1.add(sc.next());
}
int count=0;
for(int i=0;i<s1.size();i++) {
	for(int j=0;j<s.size();j++) {
	if(s1.get(i).equals(s.get(j))) {
		count++;
		s.remove(j);
	}
	}
}
if(m==count) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}
}
