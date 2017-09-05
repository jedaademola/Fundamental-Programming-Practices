package com.fpp;


import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String to Reverse:");
		String stringToReverse = in.nextLine();
		
		StringBuilder temp = new StringBuilder();
		int len = stringToReverse.length() -1;
		for (int i= len; i >= 0; --i)
		{
			temp.append(stringToReverse.charAt(i));
		}
		System.out.println("Reversed String:" + temp.toString());
	}

}
/*
 Enter String to Reverse:Arogundade Lukman Ademola
 Reversed String:alomedA namkuL edadnugorA

*/
