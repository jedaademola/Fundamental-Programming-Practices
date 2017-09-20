package com.fpp.lesson8;

public class PersonList {

	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public PersonList(String last, String first, int a) {
		lastName = last;
		firstName = first;
		age = a;
	}

	public String getLast() // get last name
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "PersonList [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}

}
