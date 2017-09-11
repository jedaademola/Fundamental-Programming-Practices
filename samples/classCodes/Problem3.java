package com.fpp;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		String EXIT ="N";
				
		System.out.println("Enter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to exit");
		
		System.out.println("Choose your Choice");
		Scanner input = new Scanner (System.in);
		int choice = input.nextInt();
		 String exit ="Y";
		
		while((choice > 0 && choice < 4) && !EXIT.equalsIgnoreCase(exit))
		{
			switch(choice)
			{
			
				case 1:
				{
					int day = input.nextInt();
					int month = input.nextInt();
					int year = input.nextInt();
					
					MyDate date1 = new MyDate(8,9,2017);
					date1.dateInMMDDYY(date1.getDayDD(), date1.getMonthMM(), date1.getYear());
					break;
				}
				case 2:
				{
					MyDate date2 = new MyDate(8,"September",2017);
					date2.dateInMMDDYY(date2.getDayDD(), date2.getMonthName(), date2.getYear());
					break;
				}
				case 3:
				{
					MyDate date3 = new MyDate(251,2017);
					date3.dateInMMDDYY(date3.getDayDDD(), date3.getYear());
					break;
				}
				default:
				{
					break;
				}
			
			}
			
			
		 System.out.println("Do you want to Continue :");
		 exit = input.next();
		 
		 if (EXIT.equalsIgnoreCase(exit))
			 break;
		 
		}

	}

}
