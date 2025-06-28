package Abstraction;

abstract class Customer
{
	String name ;
	int unitConsumed;
	 Customer(String name, int unitConsumed)
	 {
		 this.name= name;
		 this.unitConsumed = unitConsumed;
	 }
	
	abstract double calculateBill();
	
	void displayBill()
	{
		System.out.println("\t\t\tBill Details");
		System.out.println("Customer Name :" +name);
		System.out.println("Unit's Consumed :" +unitConsumed);
		System.out.println("Bills Consumed : Rs " +calculateBill());
	}

}

class ResidentialCustomer extends  Customer
{
	
	ResidentialCustomer(String name, int unitConsumed)
	{
		super (name,  unitConsumed);
	}

	double calculateBill()
	{
		double bill = (super.unitConsumed) * 3.5;
		return bill;
		
	}

}
class CommercialCustomer extends  Customer
{
	CommercialCustomer(String name, int unitConsumed)
	{
		super (name,  unitConsumed);
	}

	double calculateBill()
	{
		double bill = (super.unitConsumed) * 7.0;
		return bill;
		
	}

}
public class UnderstandingAbstractClass {

	public static void main(String[] args) {
		
		Customer c1 = new ResidentialCustomer("Rahul Sharma",100);
		c1.displayBill();
		
		Customer c2 = new CommercialCustomer("Krishna",500);
		c2.displayBill();
	}

}
