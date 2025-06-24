package Inheritance;

class Persons
{
	String name ;
	int age ;
	// this is the non parameterized
//	Persons(){
//		System.out.println("non parameterized");;
//		System.out.println(name+" "+age);;
//	}
	
	Persons(){
		this("Unknow",0);
		System.out.println("non parameterized");;
		System.out.println(name+" "+age);;
	}
	Persons( String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("\n\t\t\tParent class");
		System.out.println(name+" "+age);
		
	

	}
	 void printInfo()
	    {
		 	System.out.println("\n\tParent class method");
	    	System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    	
	    }
}

//class Employee extends Persons 
//{
//	String designation ;
//	double salary ;
//	//Though java inherits the fields from the person,java doesn't initialize the variables 
//	//
//	Employee(String designation, double salary)
//	{
//		//  Why super(name, age) is required:
//        // The parent class Persons does not have a default (no-arg) constructor.
//        // Java requires the parent part of the object to be initialized first.
//        // So we must call the appropriate parent constructor using super(...).
//        
//        // Why it must be the first line:
//        // Java enforces that the superclass constructor must run before
//        // anything else in the subclass. The object construction must follow top-down 
//		//order.
//       
//        // What happens if you don’t write super(...):
//        // Java will try to insert super(), which only works if there’s 
//		//a no-arg constructor.
//        // If the superclass only has a parameterized constructor, the compiler 
//		//throws an error.
//		
//		// and the defined parameterized constructor will never be executed
//		//now to utilize the parameterized constructor we need to use super keywords
//		
//		//super("anu",25); //  here we directly assigning the values for parent
//		// class  Instance var
//		
//		
//		//Inheritance does give access to the fields and methods of the parent class.
//		//But when calling the constructor of the parent (super(...)), we are not accessing fields 
//		//we are calling a method (the constructor) and passing arguments from the current scope
//		// Here are not trying to access the name and age fields from the parent class 
//		//Instead we are calling the parent class constructor and want's to pass the name and age
//		//java looks for name and age, and if it's not found in the current scope
//		//it will show compile time error
//		//Even though the Employee class inherits name and age from Persons, 
//		//those fields are not yet usable in 
//		//the constructor before the parent constructor is called.
//		super(name, age);
//		this.designation = designation ;
//		this.salary = salary;
//		//If i don't use the super keyword, it java will invoke super by default which 
//		// would invoke non parameterized 
//		// Inheritance allows you to access fields (name, age) and method 
//		System.out.println(name+" "+age); 
//		System.out.println(designation+" "+salary);
//	}
//	
//}


	class Employee extends Persons {
	    String designation;
	    int empId;
	    double salary;
	    Employee()
	    {
	    	super();
	    	this.designation = "Unknown";
	        this.salary = 0.0;
	        System.out.println("[Employee] Default constructor called.");
	    }
	    
	    // these are local var, so it doesn't any default values, so we need to pass the values
	    Employee(String name, int age, String designation, double salary,int empId) {
	        super(name, age);  // used  to invoke immediate parent class constructor
	        this.designation = designation;
	        this.salary = salary;
	        this.empId =empId ;
	        System.out.println("\n\t\tChild class");
			System.out.println(name+" "+age); 
			System.out.println(designation+" "+salary+" "+empId);
	    }
	    
	    
	    void printInfo()
	    {
	    	System.out.println("\n\t Child class method");
	    	System.out.println("Name from parent: " +super.name);
	        System.out.println("Age from parent: " + super.age);
	    	System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Employee Id: " + empId);
	    	System.out.println("Designation: " + designation);
	        System.out.println("Salary: " + salary);
	        //super.printInfo();
	        //super can be used to invoke immediate parent class method
	    }
	    
}
	
	class Manager extends Employee
	{
		int teamSize ;
		Manager()
		{
			
	        this.teamSize = 0;
	        System.out.println("[Manager] Default constructor called.");
		}
		Manager(String name, int age, String designation, double salary,int empId,int teamSize)
		{
			super(name,age,designation,salary,empId);
			this.teamSize = teamSize;
		}
		
		void printInfo()
		{
			System.out.println("\n\t\tManger class");
			super.printInfo();
			System.out.println("Team size: "+teamSize);
		}
	}


public class Personss {

	public static void main(String[] args) {
		
		//Even though we pass arguments to the child class constructor when creating an object, 
		//Java still uses super() automatically to call the parent class’s 
		//non-parameterized constructor 
		
		
		
		
//		Employee e = new Employee("Arun",27,"HR",1000,11);
//		e.printInfo();
		Manager m1 = new Manager("Kavya", 35, "Tech Lead", 120000.0, 22,121);
		m1.printInfo();
		
		
//		Persons p = new Persons();
//		Employee e = new Employee();
		Manager m = new Manager(); 
	}

}
