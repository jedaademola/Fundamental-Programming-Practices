package com.fpp.lesson8;

public final class Staff implements EmployeeData{
	private String name;
	private double salary;
	private int numDependants;
	
	public Staff(String name, double salary, int numDependants) {
		this.name = name;
		this.salary = salary;
		this.numDependants = numDependants;
	}
	
	public String getName() {
		return name;
	}
	
	//@Override
	public double getSalary() {
		return salary;
	}
	public int getNumDependants() {
		return numDependants;
	}
}
//1035500.0

