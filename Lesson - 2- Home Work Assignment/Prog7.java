package com.fpp;

public class Prog7 {
	
	public static void main(String[] args) {
		
		
		if(args == null || args.length <0) 
		{
			System.out.println("Invlaid Parametr!");
		}
		else
		{
		    int len = args.length;
			int countStartWithA =0;
			
			for(int i = 0; i < len; ++i) {  
				System.out.println("String Input:" + args[i] +  "  Length:" +  args[i].length());
				countStartWithA = args[i].startsWith("A") ? ++countStartWithA: countStartWithA;
			}
			
			System.out.println("Number of String Inputs start with ‘A’:" + countStartWithA);
		}
 
	}

}
/*
INPUT: Arogundade Lukman Ademola Jeda
OUTPUT
-------------------
String Input:Arogundade  Length:10
String Input:Lukman  Length:6
String Input:Ademola  Length:7
String Input:Jeda  Length:4
Number of String Inputs start with ‘A’:2
*/
