package oops;

public class CollegeStudent {
	
	// Instance variable
	
	String name ;
	int roll ;
	float marks;
	
	//Non parameterized constructor
    // Called every time you create a CollegeStudent with new CollegeStudent()
	CollegeStudent()
	{
		  // Prints current field values (which are defaults unless changed later)
		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
	}
	
	//Variable shadowing happens when a variable in a local scope
	//(like a method or constructor parameter) has the same name as a variable 
	//in an outer scope (like an instance variable in a class).
	
	// Here this refers to the constructor parameter, not the instance variable
	// It does nothing
	
//	CollegeStudent(String name, int roll, float marks)
//	{
//		name = name;
//		roll = roll;
//		marks = marks;
//		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
//		
//		
//	}
	
	// So assigning different names  to the parameter, will avoid variable shadowing
//	CollegeStudent(String n, int r, float m)
//	{
//		name = n;
//		roll = r;
//		marks = m;
//		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
//		
//		
//	}
	
	// Here this refers to the current instance
	//Hence avoids Variable Shadowing
	CollegeStudent(String name, int roll, float marks)
	{
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
		
		
	}
	
	//	CollegeStudent(CollegeStudent copy)
	//	{
	//		//Passing an object to a constructor only gives you access to that object’s reference
	//		//Inside copy constructor we   still have to copy each field
	//
	//		// JVM has just allocated memory for *this* new object.
	//	    // All its fields are still at default values (null, 0, 0.0).
	//		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
	//	}
	//	
		
		
	//Inside the constructor there is no local variable 
	//compiler looks for the local variable
	//Since there is no local variables,it will print instance var's default value
		
	//	CollegeStudent(CollegeStudent copy)
	//	{
	//		this.name = name;
	//		this.roll = roll;
	//		this.marks = marks;
	//		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
	//		
	//		
	//	}
	
	
	// Creates a *new* CollegeStudent whose state is a duplicate of the
    // object supplied as the parameter ‘copy’.
	
    CollegeStudent(CollegeStudent copy) {
        // ‘copy’ points to the existing object (e.g., cs3).
        // Copy each field from that object into the fields of *this* object.
    	
        this.name  = copy.name;   // duplicate the name
        this.roll  = copy.roll;   // duplicate the roll number
        this.marks = copy.marks;  // duplicate the marks
        
		System.out.println(name +" with rollnumber "+roll+" scored "+marks);
		//prints the  cs3 obj's copy the  holding values of cs3 being assigned to copy obj
		
	}
	
	
	void displayInfo() 
	{
		System.out.println("\nInitial value");
		System.out.println("Inside the method");
		System.out.println("Details");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll);
		System.out.println("Marks : "+marks);
	}

	public static void main(String[] args) {
		
		System.out.println("\tDefault Constructor \n");
		
		 // First object creation
        // Because no other constructor exists, the compiler's default constructor
        // would run *if* we had not defined one. But we DID define a no arg constructor,
        // so OUR constructor executes instead.
		CollegeStudent cs1  = new CollegeStudent();
		
		//  The variable are not initialized with any value 
		//And  it's  an instance variable
		//So variables will be initialized with default values
		// we can declare without initializing them
		System.out.println("\nInitial value");
		System.out.println("Details");
		System.out.println("Name : "+cs1.name);
		System.out.println("Roll Number : "+cs1.roll);
		System.out.println("Marks : "+cs1.marks);
		
		
		// Call a method that also prints those default values
		cs1.displayInfo();
		
		
		
		System.out.println("\n \t Non Parameterized Constructor\n");
		
		 // Second object creation
		//Non parameterized constructor - get's invoked as object  is created
		// After creating the object non parameterized constructor is invoked
		//It   Prints current field values 
		
		//the print statement sits inside the constructor, 
		//and the constructor runs before we assign any values
		//the fields still hold Java’s built in defaults at the moment they are printed
		CollegeStudent cs2 = new CollegeStudent(); //constructor runs, prints defaults
		
		// Manually the value is assigned to the instance variables
		cs2.name = "John"; // now the field 'name' is "John"
		cs2.roll = 102;    // now the field 'roll' is 102
		cs2.marks = 400 ;  // now the field 'marks' is 400.0
		cs2.displayInfo(); // prints the current contents of the three fields
		
		
		// Parameterized constructor
		System.out.println("\n \t  Parameterized Constructor\n");
		
		// In parameterized constructor, the values are passed while we are creating obj
		//Now the print statement inside the constructor would print the values as passed to it
		CollegeStudent cs3 = new CollegeStudent("Anu",100,495.5f);
		
		// prints the current contents of the three fields
		cs3.displayInfo();
		
		//Copy Constructor
		System.out.println("\n \t  Copy Constructor\n");
		
		// passed the object correctly (cs3 to cs4) 
		// It creates a reference to cs3 object
		CollegeStudent cs4 = new CollegeStudent(cs3);
		cs4.displayInfo();
		
		
	}

}
