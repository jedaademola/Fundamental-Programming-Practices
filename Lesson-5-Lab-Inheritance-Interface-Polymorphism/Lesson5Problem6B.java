package com.fpp.lesson5;

public class Lesson5Problem6B {


	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
		PersonDeepCopy person = new PersonDeepCopy("lukman", new ComputerDeepCopy("HP","Core i3",4,500,2.0));
      
      System.out.println("Before Cloning");
      System.out.println(person);
      System.out.println("**********************************");
      
      PersonDeepCopy cloAdd= (PersonDeepCopy) person.clone(); 
      System.out.println("After Cloning");
      System.out.println(cloAdd);
      System.out.println("**********************************");
      
      person.computer.setManufacturer("DELL");
      System.out.println("After Modifing the Manufacturer");
      System.out.println(cloAdd);
         	       
     	     
	}


}
/*
Before Cloning
PersonDeepCopy [name=lukman, computer=Manufacturer: HP
Processor: Core i3
RamSize: 4
DiskSize: 500
ProcessorSpeed: 2.0]
**********************************
After Cloning
PersonDeepCopy [name=lukman, computer=Manufacturer: HP
Processor: Core i3
RamSize: 4
DiskSize: 500
ProcessorSpeed: 2.0]
**********************************
After Modifing the Manufacturer
PersonDeepCopy [name=lukman, computer=Manufacturer: DELL
Processor: Core i3
RamSize: 4
DiskSize: 500
ProcessorSpeed: 2.0]

*/

