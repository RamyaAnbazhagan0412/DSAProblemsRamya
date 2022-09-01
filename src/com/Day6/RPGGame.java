package com.Day6;
import java.util.*;
public class RPGGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int iniPow=sc.nextInt();
		int[] mons=new int[n];
		for(int i=0;i<n;i++) {
			mons[i]=sc.nextInt();
		}
		int[] bons=new int[n];
		for(int i=0;i<n;i++) {
			bons[i]=sc.nextInt();
		}

boolean[]  b=new boolean[n];
for(int i=0;i<n;i++) {
	b[i]=false;
}
int count=0;
for(int j=0;j<n;j++) {
	for(int i=0;i<n;i++) {
	if(iniPow>=mons[i] && b[i]==false){
		iniPow+=bons[i];
		b[i]=true;
		count++;
		break;
	}
	else if(iniPow<mons[i] && b[i]==false){
		continue;
	}
}
}

System.out.println(count);
	}
}




