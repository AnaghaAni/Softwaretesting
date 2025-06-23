package oops;

class Books
{
	String title ;
	String author ;
	float price ;
	String User;
	
	Books()
	{
		 // Invoke *another* constructor in the same class.
        // Must be first statement; supplies default values. 
		// Parameterized constructor is invoked in default constructor
		
		
		//this("Huckleberry Finn","Mark Twain", 250);
		System.out.println("\t\t\tNon Parameterized constructor");
		System.out.println("\n\t\tDetails of Books");
	}
	
	Books(String title, String author, float price,String User)
	{
		// when we invoke current class constructor it must be the first statement in that constructor
		
		 // If you wrote this(); here, it would recurse and cause
        //a compile error because this(...) must be first.  
		//Default constructor is invoked in parameterized constructor
		//this();
		
		this.title = title ;
		this.author = author;
		this.price = price;
		this.User = User;
		System.out.println("\t\t\tParameterized constructor");
		//System.out.println("\n\t\tDetails of Books");
		System.out.println("\n\tInside Constructor\n");
		System.out.println("The book titled '" + title + "' by " + author + " is priced at ₹" + price + ".");
	
	}
	

	void CalculatingDiscount(float percentage)
	{
		
		//this.price ensures we are always working with the instance variable 
		//(object state), not some local variable 
		//there is no local var
		//so it automatically searches for instance var 
		//and refer to exactly the same memory location
		this.price = this.price - ( ( percentage / 100 ) * this.price)  ;
	}
	void printdiscount() 
	{
		// to invoke current class method 
		// this is automatically added at the beginning of the method by the java compiler
		float percentage = 30;
		this.CalculatingDiscount(percentage);
		System.out.println("DicountPrice       : ₹" +price );
	}
	void printInfo()
	{
		System.out.println("\nInside Method\n");
	    System.out.println("Book Title  : " + title);
	    System.out.println("Author Name : " + author);
	    System.out.println("Price       : ₹" + price);
	    this.printdiscount();
	}
	
	void withdrawedBookDetails()
	{
		withdrawalBook(this);
	}
	
	void withdrawalBook(Books b)
	{
		this.User = b.User;
		System.out.println("Book withdrawed by " +User);
	}
	

	
}

public class Practice1This {

	public static void main(String[] args) {
		
		

		Books bs1 = new Books();
//		bs1.printInfo() ;
		
		bs1.title = "Heidi";
		bs1.author = "Johanna Spyri";
		bs1.price = 100 ;
		
		bs1.printInfo() ;
		if(bs1.User!= null)
			bs1.withdrawedBookDetails();
		else 
			System.out.println("Book not yet withdrawed");
		
		
		Books bs2 = new Books("Huckleberry Finn","Mark Twain", 250,"Ram"); 
		bs2.printInfo();
		

		
		if(bs2.User!= "null")
			bs2.withdrawedBookDetails();
		else
			System.out.println("Book not yet withdrawed");
		
	
			 
		
	}


}

