package com.Day2;

public class GoldMineProblem {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		int[][] arr= {{1,3,3},{2,1,4},{0,6,4}};
		int max=arr[0][0];
		int y=0;
		int j=0;
		for(int i=0;i<n;i++) {	
			if(arr[i][j]>max) {
				max=arr[i][j];
				y=i;				
			}
		}
	//System.out.println(max);
		int x=sum(arr,y,j,n,m,max);
		System.out.println(x);
		
	}
	
	public static int sum(int arr[][],int p,int q,int n,int m,int max) {
		
		//System.out.println(max);
		System.out.println(p+" "+q+" "+n+" "+m+" "+max);
		if(q==0 && p!=n-1 && p!=0) 
		{
			q=q+1;//column
			int max1=arr[p+1][q];
			System.out.println(arr[p+1][q]);
			for(int i=q;i>=q-1;i--) {
				if(arr[i][q]>max1) {
					System.out.println("hello");
					max1=arr[i][q];
					
				}
				
			}
	
			max=max+max1;
			System.out.println(max);
		}
		else if(p==0 && q!=m-1) {
			q=q+1;//column
			int max1=arr[p][q];
				if(arr[p+1][q]>max1) {
					max1=arr[p+1][q];
					p=p+1;
				}
				max=max+max1;
				//System.out.println(max1);
		}
		else if(p==n-1 && q!=m-1) {
			q=q+1;//column
			int max1=arr[p][q];
				if(arr[p-1][q]>max1) {
					max1=arr[p-1][q];
					max=max+max1;
					p=p-1;
					
				//	System.out.println(max1);
			
		}

     }
		System.out.println(p+" "+q+" "+n+" "+m+" "+max);
	
	     if(q<m-1) {
	    	 sum(arr,p,q,n,m,max);
	     }else {
	    	 return max;
	     }

		return max;
	}

}
