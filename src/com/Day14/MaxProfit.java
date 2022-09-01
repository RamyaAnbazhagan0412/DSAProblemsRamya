package com.Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxProfit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			
			arr.add(sc.nextInt());
			
		}
		
		Collections.sort(arr);
		
		int max=arr.get(0)*n;
		
		int b=arr.get(0);
		
		for(int i=1;i<n;i++) {	
			
			if(max<arr.get(i)*(n-i)){
				
				max=arr.get(i)*(n-i);
				
				b=arr.get(i);
			}
			
		}
		
		System.out.print(b);
		
	}

}
