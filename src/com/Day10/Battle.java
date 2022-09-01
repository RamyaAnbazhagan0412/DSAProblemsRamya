package com.Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nv=sc.nextInt();//
		int h=sc.nextInt();
		int he=sc.nextInt();
		ArrayList<Integer> v=new ArrayList<Integer>();
		for(int i=0;i<nv;i++) {
			v.add(sc.nextInt());
		}
			
		
		
		int remove=0;
	  for(int k=0;k<nv;k++){//remove
		  Boolean[] bv=new Boolean[v.size()];
			Boolean[]  bh=new Boolean[h];
			for(int i=0;i<v.size();i++) {
				bv[i]=true;
            }
			for(int i=0;i<h;i++) {
				bh[i]=true;
            }
		for(int i=0;i<h;i++) {
			int hh=he;
			for(int j=0;j<v.size();j++) {
				if(hh>v.get(j) && bv[j]==true && bh[i]==true) {
					hh=hh-v.get(j);
					bv[j]=false;
				}
				else if(hh<v.get(j) && bv[j]==true && bh[i]==true) {
					hh=0;
					bh[i]=false;
					break;
				}
				else if(hh==v.get(j) && bv[j]==true && bh[i]==true) {
					hh=0;
					bv[j]=false;
					bh[i]=false;
					break;
				}	
				
			}
			
		}
		if(bh[h-1]==false && bv[v.size()-1]==true )  {
			int y=0;
		v.remove(y);
			remove++;
		}
		else {
			break;
		}
		}
			System.out.println(remove);
}

}
