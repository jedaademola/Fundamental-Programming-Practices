package com.fpp;

import java.util.Scanner;

 enum ShapeType {
	C, R, T
};

public class Problem4 {

	

	public static void main(String[] args) {
	
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");

		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your Choice:");
		String choice = input.next();

		switch (choice) {
		case "C": {
			System.out.println("Enter the Radius of the Circle:");
			double radius = input.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println("The area of Circle is :" + circle.computeArea());

			break;
		}
		case "T": {
			System.out.println("Enter the Base of the Triangle:");
			double base = input.nextDouble();
			System.out.println("Enter the height of the Triangle:");
			double height = input.nextDouble();
			Triangle tri = new Triangle(base, height);
			System.out.println("The area of Triangle is :" + tri.computeArea());

			break;
		}
		case "R": {
			System.out.println("Enter the width of the Rectangle:");
			double width = input.nextDouble();
			System.out.println("Enter the height of the Rectangle:");
			double height = input.nextDouble();
			Rectangle rec = new Rectangle(width, height);
			System.out.println("The area of Rectangle is :" + rec.computeArea());

			break;
		}

		default: {
			System.out.println("Invalid selection!");
		}

		}

	}

}
/*
 OUTPUT
 ----------------------
Enter C for Circle
Enter R for Rectangle
Enter T for Triangle

Choose your Choice:
R
Enter the width of the Rectangle:
20
Enter the height of the Rectangle:
45
The area of Rectangle is :900.0

 */
