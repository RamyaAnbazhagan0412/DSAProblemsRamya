package com.Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sweetness {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			int a=N-i;
			int b=N-a;
			if(a+b==N) {
				arr.add(a*b);
			}
		}
		System.out.print(Collections.max(arr));
	}

}
