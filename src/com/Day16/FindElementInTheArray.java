package com.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindElementInTheArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// getting arraylist size
		
		int arr1Size=sc.nextInt();
		int arr2Size=sc.nextInt();
		// getting array elements
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		
		for(int i=0;i<arr1Size;i++) {
			arr1.add(sc.nextInt());
		}
		
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		for(int i=0;i<arr2Size;i++) {
			arr2.add(sc.nextInt());
		}
		
		//getting  search element
		
		int k=sc.nextInt();
		
		for(int i=0;i<arr2Size;i++){
			arr1.add(arr2.get(i));
		}
		
		Collections.sort(arr1);
		
		System.out.print(arr1.get(k-1));
	}

}
