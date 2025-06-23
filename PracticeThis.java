package oops;

class Book
{
	String title ;
	String author ;
	float price ;
	Book(String title, String author, float price)
	{
		this.title = title;
		this.author = author ;
		this.price = price;
		System.out.println("Inside Constructor\n");
		System.out.println("The book titled '" + title + "' by " + author + " is priced at ₹" + price + ".");
	}
	
	public Book applyDiscount(float percentage) {
		this.price= this.price - ((percentage/100) * this.price);
		return this ;    //  ← returns the current Book object
		
		
	}
	public void library(Library lib)
	{
		lib.printBook(this);
	}
	void display()
	{
		System.out.println("Inside Method\n");
	    System.out.println("Book Title  : " + title);
	    System.out.println("Author Name : " + author);
	    System.out.println("Price       : ₹" + price);
	    //this return Book Object
	    this.applyDiscount(20.0f);
	    System.out.println("DicountPrice       : ₹" +price );
	   
	}
	}


class Library
{
	public void printBook(Book b) {
		System.out.println(b.title);
		System.out.println(b.author);
		System.out.println(b.price);

		
		
	}
}

public class PracticeThis {

	public static void main(String[] args) {
		
		Book b1 = new Book ("Heidi","Johanna Spyri",100.0f);
		 b1.display();
		 
		 Library lib = new Library();
		 b1.library(lib);
		 

	}

}
