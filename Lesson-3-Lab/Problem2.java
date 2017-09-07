package com.fpp;

import java.util.Scanner;

import com.fpp.lesson3.HeartRates;
import com.fpp.lesson3.Person;

public class Problem2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter Last Name:");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter your birthday "
                + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
		String dateOfBirth = scanner.nextLine();
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setDateOfBirth(dateOfBirth);//1980-9-28..yyyy-M-d"
		
		
		HeartRates rate = new HeartRates(person);
		
		System.out.println(rate.toString());

	}

}
/*
 OUTPUT
 -----------
Enter First Name:
Farah
Enter Last Name:
Arogundade
Please enter your birthday in yyyy-MM-dd format (e.g. 1980-9-28): 
2015-3-15
[Farah, Arogundade, 2015-3-15, 2, ,218,Target Heart Rate Range is between: 5180.0  and 8806.0]

 */
