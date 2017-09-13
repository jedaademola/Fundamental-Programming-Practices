package com.fpp.lesson5;

public abstract class Employee implements Payable{
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumer;

	public Employee( String firstName, String lastName,String socialSecurityNumer)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumer = socialSecurityNumer;
		
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumer="
				+ socialSecurityNumer + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumer() {
		return socialSecurityNumer;
	}
	public void setSocialSecurityNumer(String socialSecurityNumer) {
		this.socialSecurityNumer = socialSecurityNumer;
	}

}
