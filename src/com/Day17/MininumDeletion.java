package com.Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MininumDeletion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		for(int i=0;i<size;i++) {
			array.add(sc.nextInt());
		}
		
		int min=array.indexOf(Collections.min(array));
		int max=array.indexOf(Collections.max(array));
		
		int deletion=0;
		 if(array.size()==1||array.size()==2) {
				deletion+=array.size();
				}
		else  if((min<size/2 && max >size/2) || ( min>size/2 && max<size/2)) {
	    	if(max<min){
		    	deletion+=max+1;
				deletion+=array.size()-min;
		    }
	    	else {
				deletion+=min+1;
				deletion+=array.size()-max;
	    	}
		}
		else if((min<size/2 && max<size/2)|| (min>size/2 && max>size/2)) {
			if(max>min) {
				deletion+=max-min+1;
			}
			else {
				deletion+=min-max+1;
			}
		}   
	System.out.print(deletion);	
	}

}
