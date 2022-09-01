package com.Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeletionCount {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> arr=new ArrayList<Integer>();
for(int i=0;i<n;i++) {
arr.add(sc.nextInt());
}
int count=0;
int a=arr.indexOf(Collections.max(arr));
int b=arr.indexOf(Collections.min(arr));
if(a>b) {
	count=a-b+1;
}
else if(a<b) {
	count=b-a+1;
}
else if(a==b) {
	count=arr.size();
}

System.out.print(count);

	}
}
