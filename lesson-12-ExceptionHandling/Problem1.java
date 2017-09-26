package com.fpp.lesson12;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("Enter Mark between 0 to 100:");
			int mark = input.nextInt();
			
			if( mark < 0 || mark > 100)
				 throw new UnsupportedOperationException("Invalid mark,mark between 0 to 100!");
			
			  System.out.println("Mark:" + mark);
		}
		catch(UnsupportedOperationException unEx)
		{
			System.out.println(unEx.getMessage());
		}
		catch(InputMismatchException inEx)
		{
			System.out.println("Invalid Input type, please enter integer value");
		}
				
		finally
		{
			input.close();
			System.out.println("End of Program");
		}
		
		
	}

}
/*
 OUTPUT
 -----------------
Enter Mark between 0 to 100:
109
Invalid mark,mark between 0 to 100!
End of Program


Enter Mark between 0 to 100:
80
Mark:80
End of Program

 */
