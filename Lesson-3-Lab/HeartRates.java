package com.fpp;

public class HeartRates {
	
	final int REST_HEART_RATE = 70;
	final float LOWER_BOUNDARY = 0.5f;
	final float UPPER_BOUNDARY = 0.85f;
	
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public  HeartRates (Person thisPerson)
	{
		this.person = thisPerson;
	}
	
	public int getAgeInYear()
	{
		return AgeCalculator.calculateAge(person.getDateOfBirth());
	}
	
	public int maximumHeartRate() {
		return 220 - getAgeInYear();
	}
	
	private int averageHeartRate()
	{
		return maximumHeartRate() - REST_HEART_RATE;
	}
	
	private float LowerBoundaryTargetHeartRate()
	{
		return (averageHeartRate() * LOWER_BOUNDARY) * REST_HEART_RATE;
	}
	
	private float UpperBoundaryTargetHeartRate()
	{
		return (averageHeartRate() * UPPER_BOUNDARY) * REST_HEART_RATE;
	}
	
	
	public String toString() {
		return "["
				+ person.getFirstName() + 
				", " + person.getLastName() + ", " +  
				person.getDateOfBirth() + ", " +
				getAgeInYear() + ", " + 
				"," + maximumHeartRate() + "," +
				"Target Heart Rate Range is between: " + LowerBoundaryTargetHeartRate() +  "  and " + UpperBoundaryTargetHeartRate() + "]";
		}

	
}
