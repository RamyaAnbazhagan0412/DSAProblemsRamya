package com.Day12;

import java.util.Scanner;

public class Celebrity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int N=sc.nextInt();
	     int M[][] =new int[N][N];
	     for(int i=0;i<N;i++) {
	    	 for(int j=0;j<N;j++) {
		    	 M[i][j]=sc.nextInt();
		     }

	     }
	     boolean cel=false;
	     for(int i=0;i<N;i++) {
	    	 if(M[i][i]==0) {
	    		 
	    	 for(int j=0;j<N;j++) {
		    	if(M[i][j]==1 && M[j][i]==0) {
		    		cel=true;
		    	}
		    	else if(M[i][j]==1 && M[j][i]==1) {
		    		cel=false;
		    	}
		     }
	    	 }
	    	 else{
	    		 cel=false;
	    	 }
	     }
	     if(cel==true) {
	    	 System.out.print(1);
	     }
	     else {
	    	 System.out.println(-1);
	     }
	}
}
