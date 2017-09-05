package com.fpp;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display "Hello World!"
		System.out.println("Hello World!");
		
		System.out.println(17/12); // 1
		System.out.println(-17/-12); // 1
		System.out.println(-17/12); // -1
		System.out.println(17/-12); // -1
		//The sign of the result is left hand side operand.(%)
		System.out.println(17%12); // 5
		System.out.println(-17%-12); // -5
		System.out.println(-17%12); // -5
		System.out.println(5/0); // Run time error – divide by zero
		System.out.println(5.5f/0.0f); // Infinity
		System.out.println(5.5f/-0.0f); // -Infinity
		//
		System.out.println((int)1.7); // 1
		System.out.println((double)1 / 2); // 0.5
		System.out.println(1 / 2); // 0
		char ch = (char)65.25; //65
		System.out.println(ch); // A
		int i = (int)'A';
		System.out.println(i); // 65
	}

}
