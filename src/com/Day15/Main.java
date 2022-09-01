package com.Day15;

import java.util.*;

public class  Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int M=sc.nextInt();

        int[][] arr=new int[N][M];

        int count=0;

        for(int i=0;i<N;i++){

            for(int j=0;j<M;j++){

            arr[i][j]=sc.nextInt();

//            if( arr[i][j]==1){
//
//                count++;
//
//            }  
        }

        }

      int a=Math.max(N,M);

    for(int f=1;f<a;f++){

        for(int k=0;k<N-f+1;k++){

            for(int l=0;l<M-f+1;l++){

                int c=0;
                
                for(int i=k;i<f+k;i++){

                    for(int j=l;j<f+l;j++){
                 
                        if(arr[i][j]==1){

                            c++;

                        }
                                }

                }
                if(c==f*f){
                        count++;
                 }

             }
        }
        }

         System.out.println(count);                                
    }

}