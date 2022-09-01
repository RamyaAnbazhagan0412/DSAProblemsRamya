package com.Day6;
import java.util.*;
public class SieveAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(i==2 || i==3){
				System.out.print(i+" ");
			}
			else {
				if(i%2==0 || i%3==0) {
					continue;
				}
				else {
					int a=(int) Math.sqrt(i);
					Boolean s=true;
					for(int j=2;j<=a;j++) {
					
					if(i%j==0) {
						s=false;
					       break;
					}
					else {
						 s=true;
						 continue;
					        
					}
					}
					if(s==true) {
						System.out.print(i+" "); 
					}
				}
			}
		}
	}	
}
