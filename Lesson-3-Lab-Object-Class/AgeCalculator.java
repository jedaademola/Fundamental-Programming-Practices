package com.fpp;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class AgeCalculator {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    
    public static int calculateAge(String dateOfBirth) {
    	
        LocalDate today = LocalDate.now();
        return Period.between( getBirthday(dateOfBirth), today).getYears();
    }
    /*
      public static Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today);
    }
     */
    
    private static LocalDate getBirthday(String dateOfBirth) {
       
        LocalDate birthday;
                  
            try {
                birthday = LocalDate.parse(dateOfBirth, formatter);
                return birthday;
               
            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        
        return null;
    }
    
    
    /*
     *  public LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);
                return birthday;
               
            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }
     */
    public static void main(String[] args) {
      //  AgeCalculator ageCalculator = new AgeCalculator();
        //LocalDate birthday = ageCalculator.getBirthday("1980-9-28");
       // LocalDate birthday = ageCalculator.getBirthday();
      //  Period age = ageCalculator.calculateAge(birthday);
      //  System.out.printf("Today you are %d years, %d months"
         //       + " and %d days old%n",
          //      age.getYears(), age.getMonths(), age.getDays());
    }
}
