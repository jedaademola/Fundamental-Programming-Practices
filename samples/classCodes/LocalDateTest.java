package com.fpp;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 DateTimeFormatter formatterMMDDYYYY = DateTimeFormatter.ofPattern("M/d/yyyy");
		 //DateTimeFormatter formatterMMMMDDYYYY = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		// DateTimeFormatter formatterDDDYYYY = DateTimeFormatter.ofPattern("ddd yyyy");
		 
		 String dateTest = "10/23/2017";
		 LocalDate localDateTest = LocalDate.parse(dateTest, formatterMMDDYYYY);
		// localDateTest.getDayOfYear();
		// localDateTest.getYear();
		// localDateTest.getMonth();
		 
		 System.out.println( localDateTest.getDayOfYear()+ " " +localDateTest.getYear() + " FOR: ddd yyyy");
		 
		 System.out.println(
					 localDateTest.getMonth()
					 + " " + localDateTest.getDayOfMonth()
				     + "," +localDateTest.getYear() + " FOR:MMMM dd,yyyy");
		 
		 System.out.println("Day of the year:" + localDateTest.getDayOfYear()
				 + " year:"+localDateTest.getYear()
				 + " month:" + localDateTest.getMonth());
		 
		 System.out.println(dateTest);  //default, print ISO_LOCAL_DATE

	     System.out.println(formatterMMDDYYYY.format(localDateTest));
		 
		 
		
		System.out.println("Today's date: " + LocalDate.now()); // Current date
		System.out.println("Specified date: " + LocalDate.of(2000, 1, 1)); // Set a new Date
		
		 LocalDate a = LocalDate.of(2014,Month.APRIL,10);
		    
		    System.out.println(a);
		    
		    
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy");

			String date = "16-August-2017";

	        LocalDate localDate = LocalDate.parse(date, formatter);

	        System.out.println(localDate);  //default, print ISO_LOCAL_DATE

	        System.out.println(formatter.format(localDate));
	        
	      
	        System.out.println("********************************   MM/DD/YYYY ABOVE");
	        System.out.println("******************************** Month DD, YYYY");
	        
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d,yyyy");

			String date2 = "September 12,2017";

	        LocalDate localDate2 = LocalDate.parse(date2, formatter2);
	        
	        System.out.println(date2);

	        System.out.println(formatter.format(localDate2));
	        
	        System.out.println( localDate2.getDayOfYear()+ " " +localDate2.getYear() + " FOR: ddd yyyy");
			 
			 System.out.println(
					 localDate2.getMonth()
						 + " " + localDate2.getDayOfMonth()
					     + "," +localDate2.getYear() + " FOR:MMMM dd,yyyy");
			 
			 System.out.println("Day of the year:" + localDate2.getDayOfYear()
					 + " year:"+localDate2.getYear()
					 + " month:" + localDate2.getMonth());
	        
			 System.out.println("********************************");
			 
			 System.out.println("******************************** DDD YYYY BELOW");
			 /*
			 DateTimeFormatter f = DateTimeFormatter.ofPattern("ddyyyy");
			 TemporalAccessor parsed = f.parse("092017");
			 System.out.println(parsed.get(ChronoField.YEAR));
			 System.out.println(parsed.get(ChronoField.DAY_OF_MONTH));
		        */
		     DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("D yyyy");

				String date3= "251 2017";

		       LocalDate localDate3 = LocalDate.parse(date3, formatter3);
		        
		        System.out.println(date3);
		        
		        //System.out.println("Today's date: " + LocalDate.now()); // Current date
		        //System.out.println("Specified date: " + LocalDate.of(2017, 1, 1)); // Set a new Date

		      System.out.println(formatter3.format(localDate3));
		        
		      System.out.println( localDate3.getDayOfYear()+ " " +localDate3.getYear() + " FOR: ddd yyyy");
				 
				System.out.println(
						 localDate3.getMonth()
							 + " " + localDate3.getDayOfMonth()
						     + "," +localDate3.getYear() + " FOR:MMMM dd,yyyy");
				 
				 System.out.println("Day of the year:" + localDate3.getDayOfYear()
						 + " year:"+localDate3.getYear()
						 + " month:" + localDate3.getMonth());
		        
	        

			 
			 
	}
}
