package com.fpp;

public abstract class Book {
	private String title;
	private String authour;
	private double price;
	public Book(String title, String authour, double price ){
		this.title = title;
		this.authour = authour;
		this.price =price;
	}
	/*public Book(){
		
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
     @Override
	public  String toString(){
	  return "Book [title=" + title + ", authour=" + authour + ", price=" + price + "]";
	}
	public abstract void read();//{
		//System.out.println("Can Read Ebook as well as Paperbook");
	//}
	public abstract void turning();//{
		//System.out.println("Can apply Manually or Electronically");
	//}
}
