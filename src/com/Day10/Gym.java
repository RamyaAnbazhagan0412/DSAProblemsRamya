package com.Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Gym{

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int E=sc.nextInt();
		int N=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
         A.add(sc.nextInt());
	}
		Collections.sort(A,Collections.reverseOrder());
		System.out.print(minExercise(A,N,E));
   }
   public static int minExercise(ArrayList<Integer> A,int N,int E) {
	       int count=0;
		   for(int i=0;i<N;i++) {
			   if(E>0) {
			   for(int j=0;j<2;j++) {
			   if(E>=A.get(i)) {
				   E=E-A.get(i);
				   count++;
			   }
			   else
				   break;
			   }
		      }
			 else 
				   break;
	      }
		   if(E<=0)
			   return count;
		   else
			   return -1;
   }	
}