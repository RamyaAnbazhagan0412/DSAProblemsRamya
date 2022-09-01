package com.Day6;

import java.util.Scanner;

public class SieveOfEratosthenes {

		static void printPrime(int num) {
			boolean[] prime = new boolean[num + 1];
			for(int i =0;i<=num;i++) {
				prime[i] = true;
			}
			for(int i = 2;i <= Math.sqrt(num);i++) {
				if(prime[i]){
					for(int j = i;j*i<=num;j++) {
						prime[i*j] = false;
					}
				}
				
			}
			for(int k =2;k<=num;k++) {
				if(prime[k]) {
					System.out.print(k+" ");
				}
			}
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated metho
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			printPrime(n);
		}

	}

