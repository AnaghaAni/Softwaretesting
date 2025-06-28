package Polymorphism;


//class Circle  {
//	public double area ( double r)
//	{
//		 return Math.PI * r * r;
//	}
//}
//class Sphere extends Circle
//{
//	public double area ( double r)
//	{
//		System.out.println("Area of Circle : " + super.area(2.5));
//		 return Math.PI * r * r * r;
//	}
//}

class Circle  {
	//Instance method
	public void area ( double r)
	{
		System.out.println("Area of Circle : " +(Math.PI * r * r));
		
	}
	
	
	//Instance method
	//Will be overridden in subclass 
	
	public void circumference(double r)
	{
		System.out.println("Circumference of a Circle : " +(Math.PI * 2 * r));
	}
	
	//Static Method
	
	public static void CalCulateDiameter(double r)
	{
		System.out.println("Diametere of a circle "+2*r);
	}
}
class Sphere extends Circle
{
	//Overridden Method
	public void area ( double r)
	{
		
		System.out.println("Area of Sphere : " +(Math.PI * r * r * 4));
		super.area(r);
	}
	
	//  Method unique to Sphere
	public void volume(double r)
	{
		System.out.println("Volume of Sphere : " +(Math.PI * r * r * r*(4/3)));
		
	}
	
	//Static method
	public static void CalCulateDiameter(double r)
	{
	
		System.out.println("Diametere of a Sphere "+2*r);
	}
	
}
public class UnderstandingOverriding {

	public static void main(String[] args) {
		 // Reference variable of parent class pointing to child class object (Upcasting)
        Circle c = new Sphere();

        // Dynamic method dispatch: child class's overridden method is invoked
        c.area(2.5); // Calls Sphere.area()

        // Inherited method (not overridden)
        c.circumference(2.5);  // Calls Circle.circumference()

        // Static method call (based on reference type, NOT object type)
        // Even if Sphere has its own static method, this will call Circle's method
        Circle.CalCulateDiameter(2.5);  

        //  calls Circle's method
        c.CalCulateDiameter(2.5);  // Also calls Circle.CalCulateDiameter() — based on reference type

        // Downcasting: casting parent reference (pointing to Sphere) back to Sphere
        Sphere s = (Sphere) c;
        s.volume(2.5);  // Now we can call Sphere-specific methods
        
        
        ((Sphere) c).volume(2.5); // another way of downCasting

	}

}
