package com.fpp;

public class TestBook {

	public static void main(String[] args) {
		
		    //Book bk = new Book();
		//	Book ob = new Book(); // ob is a type of Book at compile time as well as runtime
			Ebook Ejava = new Ebook("Java","Horstman",45.78,"pdf"); // java is a type of Book at compile time, type of Ebook at runtime
			Book Pjava = new PaperBook("Java","Horstman",45.78,true);
				
			Book[] books = new Book[3];
			
			books[0] = Ejava;
			books[1] = Pjava;
			books[2] = new Ebook("Java8","Renuka",50.67,"kindle");
			print(books);
			
		//	System.out.println(ob);
		//	System.out.println(Ejava);
		//	System.out.println(Pjava);
		}

		public static void print(Book[] ob){
			double tot = 0.0;
			for(Book x : ob){
				tot+=x.getPrice();
			System.out.println(x);
			x.read();
			x.turning();
			}
			System.out.println("Total Price :" + tot);
		}

}
