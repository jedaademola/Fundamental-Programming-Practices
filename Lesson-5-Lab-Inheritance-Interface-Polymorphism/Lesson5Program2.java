package com.fpp.lesson5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lesson5Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
		DeptEmployee[] department = new DeptEmployee[5];
		//3 professors
		Professor prof1 = new Professor("Lukman Arogundade",LocalDate.parse("09/03/2010", format),20000.0,10);
		Professor prof2 = new Professor("Farhan Arogundade",LocalDate.parse("01/01/2017", format),20000.0,0);
		Professor prof3 = new Professor("Farah Arogundade",LocalDate.parse("03/29/2015", format),20000.0,5);
		// and 2 secretaries
		Secretary sec1 = new Secretary("Carlton Elis",LocalDate.parse("03/29/2015", format),10000.0,5.0);
		Secretary sec2 = new Secretary("Abdallah Mohammed",LocalDate.parse("03/29/2015", format),10000.00,0);
		
		department[0]=prof1;
		department[1]=prof2;
		department[2]=prof3;
		department[3]=sec1;
		department[4]=sec2;
		
		System.out.println("Do you wish to view sum of department salaries(Y/N):");
		
		String reponse = input.next();
		if('Y' == reponse.charAt(0))
		  printSalaries(department);
		else
			System.out.println("Invalid input, progrom terminated!");
		

	}
	
	public static void printSalaries(DeptEmployee[] department)
	{
		double totalSalary=0.0;
		double profTotalSalary =0.0;
		double secretaryTotalSalary =0.0;
		for(DeptEmployee d: department)
		{
			if (d instanceof Professor)
				profTotalSalary+=d.computeSalary();
			
			if (d instanceof Secretary)
				secretaryTotalSalary+=d.computeSalary();
				
			totalSalary+= d.computeSalary();
		}
		
		System.out.printf("Sum of all Professor salaries:%.2f",profTotalSalary);
		System.out.println();
		System.out.printf("Sum of all Secretary salaries:%.2f",secretaryTotalSalary);
		System.out.println();
		System.out.printf("Sum of all salaries:%.2f",totalSalary);
	}

}
/*
 OUTPUT
 --------------
Do you wish to view sum of department salaries(Y/N):
Y
Sum of all Professor salaries:60000.00
Sum of all Secretary salaries:20060.00
Sum of all salaries:80060.00




Do you wish to view sum of department salaries(Y/N):
N
Invalid input, progrom terminated!


 */
