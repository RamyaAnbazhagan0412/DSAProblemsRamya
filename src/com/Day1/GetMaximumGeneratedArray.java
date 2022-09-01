package com.Day1;

import java.util.ArrayList;
import java.util.Collections;

public class GetMaximumGeneratedArray {

	public static void main(String[] args) {
		int n=7;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		for(int i=1;i<n-3;i++) {
			arr.add(2*i, arr.get(i));	
			arr.add(2*i+1, arr.get(i)+arr.get(i+1));
	}
		//System.out.println(arr.toString());
		System.out.println(Collections.max(arr));
		
	}

}
//int[] arr=new int[n+1];
//arr[0]=0;
//arr[1]=1;
//
//for(int i=1;i<n-3;i++) {
//		arr[2*i]=arr[i];	
//		arr[2*i+1]=arr[i]+arr[i+1];	
//}
//Arrays.sort(arr);
//System.out.println(arr[arr.length()-1]);
//for(int j=0;j<arr.length;j++) {
//	System.out.println(arr[j]);
//
//}


