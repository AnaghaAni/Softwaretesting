package oops;
class Product
{
	String name;
	int id;
	double price ;
	double discount;
	double finalPrice;
	
	Product(String name, int id, double price, double discount)
	{
		// this keyword is used to distinguish between instance var and formal parameter
		this.name = name;
		this.id = id ;
		this.price =price ;
		this.discount = discount ;
	}
	
	Product()
	{
		//this keyword is to invoke current class constructor
		//non parameterized call parameterized constructor
		//this() should me the first statement
		this("Dell",0, 230000,0);
	}
	
	 Product calculateDiscount()
	{
		 //this keyword is used to return current class constructor
		//this.price ensures we are always working with the instance variable 
		//(object state), not some local variable 
		//there is no local var
		//so it automatically searches for instance var 
		//and refer to exactly the same memory location
		this.finalPrice =this.price -((this.discount/100)*this.price) ;
		return this ;
	}
	 
	 
	 
	 void comparePrice (Product p)
	 {
		 if(this.price > p.price)
			 System.out.println(p.name +" is cheap");
		else
			 System.out.println(this.name +" is cheap");
	 }
	 
	 void showProductDetail()
	 {
		 System.out.println("\t\t\tProduct Details");
		 System.out.println("Product Name : "+name);
		 System.out.println("Product ID : "+id);
		 System.out.println("Original Price : "+price);
		 System.out.println("Discount % : "+discount);
		 //this keyword is used to invoke current class constructor
		 Product p =this.calculateDiscount();
		 System.out.println("Final Price  : "+p.finalPrice);


		 
		 
	 }
	
}

public class ProductDetail {

	public static void main(String[] args) {
		Product p0 = new Product("HP Lap",123,200000,40.0d);
		p0.showProductDetail();
		
		Product p1 = new Product("Acer",234, 180000,30.0d);
		p1.showProductDetail();
		p1.comparePrice(p0);
		
		Product p2 = new Product();
		p2.showProductDetail();
		p2.comparePrice(p0);
		

	}

}
