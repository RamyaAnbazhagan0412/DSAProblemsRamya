package com.Day19;

import java.util.Scanner;

public class MinJump {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int  i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	int i=0;
	while(n>0) {
		if(arr[i]==0) {
			count=-1;
			break;
		}
		else {
		n-=arr[i];
		i=i+arr[i];
		count++;
		}
	}
	System.out.print(count);
	}

}
