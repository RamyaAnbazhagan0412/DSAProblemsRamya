package com.Day17;
import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        

        for(int i=0;i<n;i++){

            String s=sc.next();

            int a=sc.nextInt();

            ArrayList<String> arr=new ArrayList<String>();

            for(int j=0;j<a;j++){

                arr.add(sc.next());

            }

            boolean b=false;

            for(int j=0;j<a;j++){

               for(int k=j;k<a;k++){

                   StringBuffer s1=new StringBuffer();

                for(int l=j;l<=k;l++){

                s1.append(arr.get(l));

            }

            if(s.equals(s1.toString())){

                b=true;

                break;

            }
            }          

            }

            if(b==true){

                System.out.println("Yes");



            }

            else{

                System.out.println("No");

            }

        }

      

    }

}