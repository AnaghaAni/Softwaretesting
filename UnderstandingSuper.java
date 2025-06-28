package Inheritance;

//Parent class
class Parent1 {
 int a; // instance variable of Parent1

 // Default constructor
 Parent1() {
     this.a = 10; // Initializes Parent1's 'a' to 10
     System.out.println("Parent a = " + a); // Output: Parent a = 10
 }

 // Parameterized constructor
 Parent1(int a) {
	 super();
     this.a = a; // Initializes Parent1's 'a' with passed parameter
     System.out.println("Parent a = " + a); // Output: Parent a = <value passed>
 }
 
 void display()
 {
	 System.out.println("In method :"+a);
 }
 
 
}

//Child class
class child extends Parent1 {
 int b; // instance variable of child

 // int a; ->this adds a new 'a' variable to the child,
 // which SHADOWS Parent1's 'a'. If this is declared, then 'this.a' will refer
 // to child's 'a', and 'super.a' will still refer to Parent1's 'a'.
 // int a;

 //  Default constructor version
 /*
 child() {
     // Since no super() is called, Java implicitly calls super() — the default constructor
     // So Parent1's default constructor sets a = 10

     this.b = 40; // Sets child.b to 40

     // If child doesn't have its own 'a', this accesses Parent1's 'a', which is 10
     // If child had 'int a' declared, this would print 0 (default value of child.a)
     System.out.println("Child before initializing var a = " + a);

     a = 20; // Assigns 20 to child.a if declared, otherwise sets Parent1.a to 20
     System.out.println("Child var a = " + a); // Output: 20

     System.out.println("b = " + b); // Output: 40

     // Always refers to Parent1's 'a'
     System.out.println("Parent a = " + super.a); // Output: 10 (if not modified above)
 }
 */

 // Parameterized constructor without calling super(a)
 /*
 child(int a, int b) {
     // Implicitly calls super() since super(a) is not used
     // So Parent1.a is initialized to 10

     this.b = 20; // Overrides b with 20 (ignoring passed b)

     System.out.println("Child var a = " + a); // Refers to local parameter a
     System.out.println("instance b = " + this.b); // Refers to field b = 20
     System.out.println("local b = " + b); // Refers to parameter b passed in constructor
     System.out.println("Parent a = " + super.a); // Will print 10 from Parent1 default constructor
 }
 */

//  ACTIVE VERSION: Parameterized constructor with super(a)
 child(int a, int b) {
	
     super(a); // Calls Parent1(int a), sets Parent1.a = 1000 (if passed from main)

     this.b = 20; // Sets child.b = 20 (ignoring passed b)

     System.out.println("Child var a = " + a); // Local parameter a = 1000
     System.out.println("instance b = " + this.b); // Field b = 20
     System.out.println("local b = " + b); // Local parameter b = 202
     System.out.println("Parent a = " + super.a); // Accesses Parent1.a = 1000
 }
}


//Child class extending Parent1
class child1 extends Parent1 {
 int b;

 // Constructor for child1
 child1(int a, int b) {
     super(a);   // Calls Parent1(int a), sets Parent1.a = a
     this.b = b; // Initializes child1's own 'b'
 }

 // display method overridden in child
 void display() {
     super.display(); // Calls Parent1's display() to print 'a'
     System.out.println("b in child: " + b); // Prints child’s 'b'
 }
}

class child2 extends Parent1 {
    int b;

    // Constructor 1: uses Parent1's default constructor
    child2(int b) {
        super();            // sets Parent1.a = 10
        this.b = b;
        System.out.println("b in child: " + b);
    }

    // Constructor 2: uses Parent1's parameterized constructor
    child2(int a, int b) {
        super(a);           // sets Parent1.a = a
        this.b = b;
        System.out.println("b in child: " + b);
    }
}


//Main class
public class UnderstandingSuper {
 public static void main(String[] args) {
	 
//	 child c0 = new child ();
     //Test the parameterized constructor
     child c = new child(1000, 202);

     System.out.println("instance b = " + c.b); // c.b = 20

     // 'a' is inherited from Parent1 unless child has its own 'a'
     System.out.println("a = " + c.a); // c.a = 1000 (from Parent1)
	 
	 
//	 child1 cc1 = new  child1(121, 456);
//	 cc1.display();
//	 System.out.println("instance b = " + cc1.b);
//	 System.out.println("a = " + cc1.a);
	 
	 
//	 child2 c2 = new child2(56);
//	 
//	 child2 c3 = new child2(99,567);
	 
 }
}

