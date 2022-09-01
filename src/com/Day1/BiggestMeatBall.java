package com.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggestMeatBall {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int n=4;
		int kg=2;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(3);
		int i=0;
		
while(arr.size()<=4) {			

	if(arr.get(0)==kg+1 && arr.size()==2 && arr.get(0+1)==0) {
		System.out.print(arr.get(0));
		break;
	}

else if(arr.get(0)>=2 && arr.size()>=2) {
	int a=arr.get(0)-kg;
	arr.remove(arr.get(0));
	arr.add(arr.size(), a);

} 
else if(arr.get(0)==1 || arr.get(0)==0) {
	arr.remove(arr.get(0));
}

i++;
}

	}

}











