package com.fpp;

public class MinimumCharacter {
	

	public static void main(String[] args) {
		
		System.out.println("Minimum Character: " + getMinimumCharacter("lukman"));
	}
	
	public static char getMinimumCharacter(String input)
	{
		if(input == null || input.equals(""))
			return 0;
		else
		{
		char min ;
		if (input.length() == 1)
			return input.charAt(0);
		else
		{
		
			
			min = input.charAt(0);
			
			if(min < getMinimumCharacter(input.substring(1)))
			{
				return min;
			}
			else
			{
				return getMinimumCharacter(input.substring(1));
			}
			
			
		}
	}
		
	}

}
/*
 Minimum Character: a
 */
