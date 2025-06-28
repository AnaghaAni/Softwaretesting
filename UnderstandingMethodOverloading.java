package Polymorphism;

//Base class for calculating areas and volumes
class Area {

 // Method to calculate area of rectangle with int parameters
 public int area(int l, int b) {
     return l * b;
 }

 // Overloaded method: area of rectangle with double parameters
 public double area(double l, double b) {
     return l * b;
 }

 // Overloaded method: volume of a cuboid with int parameters
 public int area(int l, int b, int h) {
     return l * b * h;
 }

 // Overloaded method: volume of a cuboid with mixed (int, double, int)
 public double area(int l, double b, int h) {
     return l * b * h;
 }
}

//Derived class that inherits from Area
class SurfaceArea extends Area {

 // Overriding the method from Area to calculate total surface area of a cuboid
 public int area(int l, int b, int h) {
     return 2 * (l * b + b * h + h * l);
 }

 // Overloaded method: area of a circle
 public double area(double r) {
     return 3.14 * r * r;
 }
}

public class UnderstandingMethodOverloading {

 public static void main(String[] args) {

     // Create object of base class Area
     Area a = new Area();

     // Call overloaded methods from Area class
     System.out.println("Area of rectangle (int) : " + a.area(5, 6));      
     System.out.println("Area of rectangle (double) : " + a.area(5.5, 6.5));   
     System.out.println("Area of Cuboid : " + a.area(5, 2, 4));                
     System.out.println("Area of Cuboid : " + a.area(5, 2.5, 4));              

     // Create object of derived class SurfaceArea
     SurfaceArea sa = new SurfaceArea();

     // This calls the overridden method in SurfaceArea
     System.out.println("Total Surface area of a Cuboid : " + sa.area(2, 3, 4)); 

     // Calls the circle area method defined only in SurfaceArea
     System.out.println("Area of circle : " + sa.area(2.5));                   
 }
}
