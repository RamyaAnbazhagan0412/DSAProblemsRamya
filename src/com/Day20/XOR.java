package com.Day20;

public class XOR {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(xor(a,b));
	}
	public static int xor(int x,int y) {
		return (x+y -(2*(x & y)));
	} 

}
