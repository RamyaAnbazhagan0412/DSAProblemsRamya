package com.Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BananaProblem {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int i=0;i<n;i++) {
    		al.add(sc.nextInt());
    	}
    	int h=sc.nextInt();	
    for(int j=h/2;j<=Collections.max(al);j++) {
    	int h1=h;
    	ArrayList<Integer> arr=new ArrayList<Integer>(al);
        while(h1>0) {
    	    for(int i=0;i<arr.size();i++) {
    	    	//System.out.println(h1);
    	         int a=	arr.get(i)-j;
    		      arr.set(i, a);
    		      h1--;
    		      if(arr.get(i)<=0 ) {
    		    	  arr.remove(i);
    		      }
    		      //System.out.println(arr.toString());
    		}
    		}  
        if(arr.isEmpty()==true) {
        	System.out.print(j);
        	break;
        }
       
    	}
	}
}
