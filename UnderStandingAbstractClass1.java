package Abstraction;

abstract class Shape
{
	String color ;
	Shape(String color)
	{
		this.color = color ;
		
	}
	
	//abstract methods cannot be static
	//abstract methods cannot be final
	abstract double calculateArea();

	abstract double calculatePerimeter();
	
	//concrete method can be final
	// this is possible as its not use any static data members or methods
	//final method in an abstract class - but the method must concrete
	public static final void show()
	{
		System.out.println("shapes");
	}
	
	//concrete method 
	public  void display() { // this method cannot be static as its using non static methods and fields
		System.out.println("\n\t\tCalculations");
	    System.out.println("Color: " + color);
	    System.out.println("Area: " + calculateArea() +" square meters");
	    System.out.println("Perimeter: " + calculatePerimeter() +" m");
	}
	
	
}

class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(String color, int length, int breadth)
	{
		//final method can be inherited but cannot be overridden
		super( color);
		super.show();
		System.out.println("\n\t\t\t Rectangle");
		this.length = length ;
		this.breadth = breadth;
		
	}
	double calculateArea()
	{
		double area = length * breadth ;
		return area;
	}
	
	double calculatePerimeter()
	{
		double perimeter =  2 * (length + breadth);
		return perimeter;
	}
}


class Square extends Shape
{
	int side;

	Square(String color, int side)
	{
		super(color);
		System.out.println("\n\t\t\t Square");
		this.side = side ;
		
		
	}
	double calculateArea()
	{
		double area = side * side ;
		return area;
	}
	
	double calculatePerimeter()
	{
		double perimeter =  4 *side;
		return perimeter;
	}
}

class Triangle extends Shape
{
	int side1;
	int side2;
	int side3;

	Triangle(String color, int side1, int side2, int side3)
	{
		super(color);
		System.out.println("\n\t\t\t Triangle");
		this.side1 = side1 ;
		this.side2 = side2 ;
		this.side3 = side3 ;
		
		
	}
	double calculateArea()
	{
		int s = side1 + side2 + side3;
		double area = Math.sqrt(s * ( s - side1) * ( s - side2 ) * ( s - side3)) ;
		return area;
	}
	
	double calculatePerimeter()
	{
		double perimeter = side1 + side2 + side3;;
		return perimeter;
	}
}
public class UnderStandingAbstractClass1 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle("Red",5,6);
		s1.display();
		Shape.show();
		Shape s2 =new  Square("Blue",5);
		s2.display();
		Shape s3 =new  Triangle("Green",2,3,4);
		s3.display();

	}

}
