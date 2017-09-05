package com.fpp;

public class Prog1 {

	public static void main(String[] args) {
		
		//1. get a random number x in the range 1 .. 9 and compute πx.
		int x=RandomNumbers.getRandomInt(1, 9);
		System.out.println("πx:"  + x);
		//2. get a random number y in the range 3 .. 14 and compute yπ.
		int y= RandomNumbers.getRandomInt(3, 14);
		System.out.println("yπ:"  + y);
	}

}
