package com.fpp;

public class Book {
	private String title;
	private String auhtor;
	private double price;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuhtor() {
		return auhtor;
	}

	public void setAuhtor(String auhtor) {
		this.auhtor = auhtor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String title,String auhtor,double price)
	{
		this.title = title;
		this.auhtor=auhtor;
		this.price= price;
	}
	//public Book()
	//{
		
	//}

	public void read() {
		// TODO Auto-generated method stub
		
	}

	public void turning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", auhtor=" + auhtor + ", price="
				+ price + "]";
	}
	

}
