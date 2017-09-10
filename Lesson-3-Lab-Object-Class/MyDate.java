package com.fpp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {
	
	
	 DateTimeFormatter formatterMMDDYYYY = DateTimeFormatter.ofPattern("M/d/yyyy");
	 DateTimeFormatter formatterMMMMDDYYYY = DateTimeFormatter.ofPattern("MMMM d,yyyy");
	 DateTimeFormatter formatterDDDYYYY = DateTimeFormatter.ofPattern("D yyyy");
	 final String SPACE =" ";
	 
	private int monthMM;
	private int dayDD;
	private int year;
	private String monthName;
	private int dayDDD;
	
	public MyDate(int day,int month,int year)
	{
		this.dayDD = day;
		this.monthMM = month;
		this.year= year;
	}
	
	public MyDate(int day,String month,int year)
	{
		this.dayDD = day;
		this.monthName = month;
		this.year= year;
	}
	
	public MyDate(int day,int year)
	{
		this.dayDDD = day;
		this.year= year;
	}
	
	public void dateInMMDDYY()
	{
		
		 String dateString=  monthMM + "/" + dayDD + "/" + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterMMDDYYYY);
		 
		 System.out.println();
		 System.out.println("CHOICE 1 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s", dateString);
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("DDD yyyy: %s", 
				 localDateTest.getDayOfYear()
				 + " " +localDateTest.getYear());
	}
	
	/*
	public void dateInMMDDYYWithParameters(int day,int month,int year)
	{
		
		 String dateString=  month + "/" + day + "/" + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterMMDDYYYY);
		 
		 System.out.println();
		 System.out.println("CHOICE 1 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s", dateString);
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("DDD yyyy: %s", 
				 localDateTest.getDayOfYear()
				 + " " +localDateTest.getYear());
	}
	*/
	public void dateInMMMMDDYYYY()
	{
		 String dateString= monthName + SPACE + dayDD + "," + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterMMMMDDYYYY);
		 
		 System.out.println();
		 System.out.println("CHOICE 2 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s", 
				 localDateTest.getMonthValue()
				 + "/" + localDateTest.getDayOfMonth()
			     + "/" +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("DDD yyyy: %s", 
				 localDateTest.getDayOfYear()
				 + " " +localDateTest.getYear());
		 System.out.println();
	}
/*
	public void dateInMMMMDDYYYYWithParameters(int day,String month,int year)
	{
		 String dateString= month + SPACE + day + "," + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterMMMMDDYYYY);
		 System.out.println();
		 System.out.println("CHOICE 2 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s", 
				 localDateTest.getMonthValue()
				 + "/" + localDateTest.getDayOfMonth()
			     + "/" +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("DDD yyyy: %s", 
				 localDateTest.getDayOfYear()
				 + " " +localDateTest.getYear());
		 System.out.println();
	}
	*/
	public void dateInDDDYYYY()
	{
		 String dateString= dayDDD + SPACE + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterDDDYYYY);
		 
		 System.out.println();
		 System.out.println("CHOICE 3 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s",  
				 localDateTest.getMonthValue()
				 + "/" + localDateTest.getDayOfMonth()
			     + "/" +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
					 System.out.println();
		 System.out.printf("DDD yyyy: %s",dateString);
		
	}
	/*
	public void dateInDDDYYYYWithParameters(int day,int year)
	{
		 String dateString= day + SPACE + year;
		 LocalDate localDateTest = LocalDate.parse(dateString, formatterDDDYYYY);
		 
		 System.out.println();
		 System.out.println("CHOICE 3 OUTPUT");
		 System.out.println("*********************");
		 System.out.printf("MM/dd/yyyy: %s",  
				 localDateTest.getMonthValue()
				 + "/" + localDateTest.getDayOfMonth()
			     + "/" +localDateTest.getYear());
		 System.out.println();
		 System.out.printf("MMMM dd,yyyy: %s", 
				 localDateTest.getMonth()
				 + " " + localDateTest.getDayOfMonth()
			     + "," +localDateTest.getYear());
					 System.out.println();
		 System.out.printf("DDD yyyy: %s",dateString);
		
	}
	*/
	
	public int getMonthMM() {
		return monthMM;
	}
	public void setMonthMM(int monthMM) {
		this.monthMM = monthMM;
	}
	public int getDayDD() {
		return dayDD;
	}
	public void setDayDD(int dayDD) {
		this.dayDD = dayDD;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public int getDayDDD() {
		return dayDDD;
	}
	public void setDayDDD(int dayDDD) {
		this.dayDDD = dayDDD;
	}
	
	public String toString()
	{
		return "";
	}

}
