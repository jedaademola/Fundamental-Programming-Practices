package com.fpp;

public class Prog2 {

	public static void main(String[] args) {
		float num1= 1.27f;
		float num2 = 3.881f;
		float num3= 9.6f;
		//1. the sum of the floats as an integer, obtained by casting the sum to type int
		int sumAInteger = (int) (num1 + num2 + num3);
		System.out.println("the sum of the floats as an integer:"  + sumAInteger);
		//2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the Math.round function
		int sumAIntegerRounding = Math.round(num1 + num2 + num3);
		System.out.println("the sum of the floats as an integer(rounding):"  + sumAIntegerRounding);

		
	}

}
