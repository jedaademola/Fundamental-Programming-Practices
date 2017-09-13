package com.fpp.lesson5;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name,LocalDate hireDate, double salary)
	{
		this.hireDate= hireDate;
		this.name=name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary()
	{
		return salary;
	}

}
