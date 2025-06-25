package oops;
class Order
{
	 
	 static int counter=1 ; // shared among the variable
	 String customerName;
	 int orderId ;
	 double amount ;
	 Order()
	 {
		 this("Unknown",0.0); //constructor chaining
	 }
	 Order(String customerName, double amount)
	 {
		 this.orderId = counter ++;
		 this.customerName = customerName ;
		 this.amount = amount ;
		//initialize local var

	 }
	 
	 void displayOrderDetails()
	 {
		 System.out.println("\t\t\t About Orders\n");
		 System.out.println("OrderId :" +orderId);
		 System.out.println("Customer Name :" +customerName);
		 System.out.println("Amount :" +amount);
	 }
}
class OnlineOrder extends Order
{
	String deliveryAddress;
	OnlineOrder(String customerName, double amount)
	{
		this(customerName,amount,"n/A");
	}
	OnlineOrder( String customerName, double amount,String deliveryAddress)
	{
		super(customerName, amount); // invoking parent class method
		this.deliveryAddress =  deliveryAddress;
	}
	
	void displayOrderDetails()
	 {
		 System.out.println();
		 super.displayOrderDetails();
		 System.out.println("\n\t\t Online Order\n");
		 System.out.println("Deliver Address : "+deliveryAddress);
		 
	 }


}

class StoreOrder extends Order
{
	String storeLocation ;
	StoreOrder ( String customerName, double amount, String storeLocation )
	{
		super(customerName, amount);
		this.storeLocation = storeLocation ;
	}
	
	void displayOrderDetails()
	 {
		 System.out.println();
		 super.displayOrderDetails();
		 System.out.println("\n\t\t Store Order\n");
		 System.out.println("Deliver Address : "+storeLocation);
		 
	 }
	
}

public class OnlineOrderSm {

	public static void main(String[] args) {
		
		Order o[] = new Order[3];
		o[0] = new OnlineOrder( "Riya Sharma", 1200.50, "Delhi, India");
		o[1] = new StoreOrder( "Arjun Mehta", 850.00, "Mumbai Branch");
		o[2] = new OnlineOrder("Manish Gupta", 700.00);
		
		for(Order os : o) {
			os.displayOrderDetails();
		}
		

	}

}
