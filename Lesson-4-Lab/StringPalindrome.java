package com.fpp;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String to check:");
		String stringInput = input.next();
		 
		System.out.println(  (stringInput.equals(palindrome(stringInput))? 
				stringInput + ":is palindrome" : stringInput +" is not palindrome" ));
		
	}
	
	public static String palindrome(String input)
	{
	
		if(input == null || input.equals("") || input.length() < 2 )
			return input;
		else
		{
		
			return palindrome(input.substring(1)) +  input.charAt(0);
			
		}
		
		
	}

}
