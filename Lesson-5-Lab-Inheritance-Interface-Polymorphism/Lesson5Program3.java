package com.fpp.lesson5;

import com.fpp.lesson5.DownwardHat;
import com.fpp.lesson5.FaceMaker;
import com.fpp.lesson5.Figure;
import com.fpp.lesson5.UpwardHat;
import com.fpp.lesson5.Vertical;

public class Lesson5Program3 {

	public static void main(String[] args) {
		
		Figure[] figures = { new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
		printFigures(figures);
		System.out.println();
		System.out.println("***************************");
		printFiguresWithClassName(figures);

	}
	 public static void printFigures(Figure[] figures)
	 {
		 for (Figure f : figures)
		 {
			f.getFigure();
		 }
	 }
	 
	 public static void printFiguresWithClassName(Figure[] figures)
	 {
		 for (Figure f : figures)
		 {
			 System.out.print(f.getClass().getSimpleName() + ":"); ;
			 f.getFigure();
			 System.out.println();
		 }
	 }

}
/*
 OUTPUT
 ----------------
  /\  \/  :)  || 
***************************
UpwardHat: /\ 
DownwardHat: \/ 
FaceMaker: :) 
Vertical: || 
 
 
*/