package com.Day1;

public class IndicesOfSortedElement {

	public static void main(String[] args) {
		int[] arr = new int[] {5,6,3,7,1};
		int val=2;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]) {
				for(int j=0;j<val;j++) {
					System.out.println(arr[j]);
				}
			}
			else{
				System.out.print("[]");
			}
		}

	}

}
