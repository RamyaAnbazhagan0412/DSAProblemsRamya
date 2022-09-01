package com.Day14;

import java.util.*;

public class  Main{

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();

    int M=sc.nextInt();

    int K=sc.nextInt();

    ArrayList<Integer> Di=new ArrayList<Integer>();

    for(int i=0;i<M;i++){

        Di.add(sc.nextInt());

    }

    ArrayList<Integer> days=new ArrayList<Integer>();

    Collections.sort(Di);

    if(K>0 && M>1) {
   	
   for(int i=0;i<M-1;i++){
	   int a=0;
	       if(i==0) {
	    	   a=Di.get(i)-1;
	    	   days.add(a);
	       }
	       else if()
	   
       }
   
   }    

   
   System.out.println( days.toString());
    //System.out.println( Collections.max(days));

   

}

}
//Score: 10/30
//Status: Passed
//INPUT	ACTUAL OUTPUT	EXPECTED OUTPUT
//10 5 2 6 9 3 2 7	5	5
//7 2 0 3 4	2	3
//4 1 2 3	       2