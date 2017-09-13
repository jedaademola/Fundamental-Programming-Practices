package com.fpp.lesson5;

public class Lesson5Problem5 {

	public static void main(String[] args) {
			
		Computer computer1 = new Computer("HP","Core i3",4,500,2.0);
		Computer computer2 = new Computer("LENOVO","Core i5",8,500,1.6);
		
		System.out.println("computer1.equals(computer2) : " + computer1.equals(computer2));
		System.out.println("**********************************");
		System.out.println("" + computer1.toString());
		System.out.println("**********************************");
		System.out.println("" + computer2.toString());
		System.out.println("**********************************");
		System.out.println("Computer1 Power:" + computer1.computePower());
		System.out.println("Computer2 Power:" + computer2.computePower());
		System.out.println("**********************************");
		System.out.println("Computer1 HashCode:" + computer1.hashCode());
		System.out.println("Computer2 HashCode:" + computer2.hashCode());
	

	}

}
/*
OUTPUT
-------------------------
computer1.equals(computer2) : false
**********************************
Manufacturer: HP
Processor: Core i3
RamSize: 4
DiskSize: 500
ProcessorSpeed: 2.0
**********************************
Manufacturer: LENOVO
Processor: Core i5
RamSize: 8
DiskSize: 500
ProcessorSpeed: 1.6
**********************************
Computer1 Power:8.0
Computer2 Power:12.8
**********************************
Computer1 HashCode:1925247580
Computer2 HashCode:1725898956

*/