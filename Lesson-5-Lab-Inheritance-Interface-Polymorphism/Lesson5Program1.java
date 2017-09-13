package com.fpp.lesson5;

import com.fpp.lesson5.Circle;
import com.fpp.lesson5.Rectangle;
import com.fpp.lesson5.Shape;
import com.fpp.lesson5.Square;

public class Lesson5Program1 {

	public static void main(String[] args) {
						
		Rectangle rec = new Rectangle("Purple",3.0,5.0);
		Circle  cir = new Circle("Blue",3.0);
		Square sq = new Square("Red",3.0);
		
		Circle  cir2 = new Circle("Pink",2.0);
		Rectangle rec3 = new Rectangle("Orange",2.0,4.0);
		
		Shape[] shapes = new Shape[5];
		//Shape[] shapesM = {rec,cir,sq,cir2,rec3};
		shapes[0]=rec;
		shapes[1]=cir;
		shapes[2]=sq;
		shapes[3]=cir2;
		shapes[4]=rec3;
		
		printTotal(shapes);

	}
	
	public static void printTotal(Shape[] shapes)
	 { 
		double totalArea=0.0;
		double perimeter=0.0;
		
		for(Shape s:shapes)
		{
			System.out.println("*********************************");
			System.out.printf("Each area of shapes:%.2f", s.calculateArea());
			System.out.println();
			System.out.printf("Each perimeter of shapes:%.2f",  s.calculatePerimter());
			System.out.println();
			
			
			totalArea += s.calculateArea();
			perimeter+= s.calculatePerimter();
		}
		System.out.println();
		System.out.println("TOTAL");
		System.out.println("*********************************");
		System.out.printf("Total area of shapes:%.2f", totalArea);
		System.out.println();
		System.out.printf("Total perimeter of shapes:%.2f", perimeter);
	 } 

}
/*
*********************************
Each area of shapes:15.00
Each perimeter of shapes:16.00
*********************************
Each area of shapes:28.27
Each perimeter of shapes:18.85
*********************************
Each area of shapes:9.00
Each perimeter of shapes:12.00
*********************************
Each area of shapes:12.57
Each perimeter of shapes:12.57
*********************************
Each area of shapes:8.00
Each perimeter of shapes:12.00

TOTAL
*********************************
Total area of shapes:72.84
Total perimeter of shapes:71.42
 */
