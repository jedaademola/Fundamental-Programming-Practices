package com.fpp;

public class PaperBook extends Book{
	   private boolean color; 
		public PaperBook(String title, String authour, double price,boolean color) {
			super(title, authour, price);
			this.color = color;
		}
		@Override
		public String toString() {
			String res = super.toString();
			return res + " Paperbook [color =" + color + "]";
			//return " Paperbook [color =" + color + "]";
		}
		@Override
		public void read(){
			System.out.println("Can Read through Manually hardcopies");
		 }
		@Override
		public void turning(){
			System.out.println("Can apply Manually");
		}
	public void Pbookmethod(){
			
		}
	}