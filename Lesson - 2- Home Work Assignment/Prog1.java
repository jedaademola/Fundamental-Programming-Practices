package com.fpp;

public class Prog1 {

	public static void main(String[] args) {
		//1. get a random number x in the range 1 .. 9 and compute πx.
		int x=RandomNumbers.getRandomInt(1, 9);
		System.out.println("x:"  + x);
		System.out.println("πx:"  + Math.pow(Math.PI, x));
		//2. get a random number y in the range 3 .. 14 and compute yπ.
		int y= RandomNumbers.getRandomInt(3, 14);
		System.out.println("y:"  + y);
		System.out.println("yπ:"  + Math.pow(y, Math.PI));

	}

}
/*
x:7
πx:3020.2932277767914
y:14
yπ:3987.194457670312

*/
