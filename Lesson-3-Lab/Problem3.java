package com.fpp.lesson3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		final String EXIT ="N";
				
		System.out.println("Enter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to exit");
		
		System.out.println();
		Scanner input = new Scanner (System.in);
		System.out.println("Choose your Choice:");
		int choice = input.nextInt();
		String exit ="Y";
		//TODO USE ENUM to CHECK month name and validate other input
		//while((choice > 0 && choice <= 4) && !EXIT.equalsIgnoreCase(exit))
		while(!EXIT.equalsIgnoreCase(exit))
		{
			System.out.println("Choice:" + choice);
			
			switch(choice)
			{
			   	case 1:
				{
					
					System.out.println("Enter Month:");
					int month = input.nextInt();
					
					System.out.println("Enter Day:");
					int day = input.nextInt();
					
					System.out.println("Enter Year:");
					int year = input.nextInt();
					if (month < 1 || day < 0 || year < 0)
						
						System.out.println("Error: Invalid Inputs");
					else
					{
						MyDate date1 = new MyDate(day,month,year);
						date1.dateInMMDDYY(date1.getDayDD(), date1.getMonthMM(), date1.getYear());
					}
									
					 
					break;
				}
				case 2:
				{
					
					
					System.out.println("Enter Month in text:");
					String month = input.next();
					
					System.out.println("Enter Day:");
					int day = input.nextInt();
					
					System.out.println("Enter Year:");
					int year = input.nextInt();
					
					if (month == null || month == "" || day < 0 || year < 0)
						
						System.out.println("Error: Invalid Inputs");
					else
					{
						MyDate date2 = new MyDate(day,month,year);
						date2.dateInMMDDYY(date2.getDayDD(), date2.getMonthName(), date2.getYear());
					}
					
					
					break;
				}
				case 3:
				{
										
					System.out.println("Enter Day of Year:");
					int day = input.nextInt();
					
					System.out.println("Enter Year:");
					int year = input.nextInt();
					
					if (day < 0 || year < 0)
						
						System.out.println("Error: Invalid Inputs");
					else
					{
						MyDate date3 = new MyDate(day,year);
						date3.dateInMMDDYY(date3.getDayDDD(), date3.getYear());
					}
					
				
					break;
				}
				default:
				{
					System.out.println("Terminated");
					return;
				}
				
			
			}
			
			 System.out.println();
			 System.out.println("Do you want to Continue:");
			 exit = input.next();
			 
			 if (EXIT.equalsIgnoreCase(exit))
			 {
				 System.out.println("Terminated");
				 break;
			 }
			 else
			 {
				System.out.println("Enter 1 for format: MM/DD/YYYY");
				System.out.println("Enter 2 for format: Month DD, YYYY");
				System.out.println("Enter 3 for format: DDD YYYY");
				System.out.println("Enter 4 to exit");
				System.out.println();
				System.out.println("Choose your Choice:");
				 choice = input.nextInt();
			 }
		 
		}

	}

}
/*
 OUTPUT
--------------------
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit

Choose your Choice:
1
Choice:1
Enter Month:
09
Enter Day:
08
Enter Year:
2017

CHOICE 1 OUTPUT
*********************
MM/dd/yyyy: 9/8/2017
MMMM dd,yyyy: SEPTEMBER 8,2017
DDD yyyy: 251 2017
Do you want to Continue:
y
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit

Choose your Choice:
2
Choice:2
Enter Month in text:
September
Enter Day:
08
Enter Year:
2017

CHOICE 2 OUTPUT
*********************
MM/dd/yyyy: 9/8/2017
MMMM dd,yyyy: SEPTEMBER 8,2017
DDD yyyy: 251 2017

Do you want to Continue:
y
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit

Choose your Choice:
3
Choice:3
Enter Day of Year:
251
Enter Year:
2017

CHOICE 3 OUTPUT
*********************
MM/dd/yyyy: 9/8/2017
MMMM dd,yyyy: SEPTEMBER 8,2017
DDD yyyy: 251 2017
Do you want to Continue:
n
Terminated


 */
