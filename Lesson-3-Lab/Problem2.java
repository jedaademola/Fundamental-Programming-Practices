package com.fpp;

public class Problem2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("Farah");
		person.setLastName("Arogundade");
		person.setDateOfBirth("2015-3-15");//1980-9-28..yyyy-M-d"
		
		HeartRates rate = new HeartRates(person);
		
		System.out.println(rate.toString());

	}

}
