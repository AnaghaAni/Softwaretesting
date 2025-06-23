package oops;

class Profile
{
	SchoolStudent s; // when we pass this an arg in the constructor call, we need to 
	//Instance variable that will hold a student object
	Profile(SchoolStudent s)
	{
		//constructor receives a SchoolStudent 
		this.s = s; //this distinguishes the field from the parameter
	}
	void profile()
	{
		System.out.println("\n \t\tProfile Details");
		System.out.println("Name : "+s.name); // it becomes out of scope
		System.out.println("Roll Number : "+s.id); //unless you qualify them with an object reference(s)
		System.out.println("age : "+s.age);
		System.out.println("Marks : "+s.marks);
	}
}


class SchoolStudent
{
	String name;
	int age ;
	int id ;
	float marks;
	float percentage ;
	
	SchoolStudent( )
	{
		this("Anu",15,2,90);// to invoke current class constructor
		System.out.println("\t\t\t Non Parametrized Constructor");
		
		System.out.println(name +" with rollnumber "+id+" has an age of "+age);

	}
	
	SchoolStudent( String name, int age, int id,float marks)
	{
		System.out.println("\t\t\t  Parametrized Constructor");
		this.name = name;
		this.age = age ;
		this.id = id ;
		this.marks = marks;
		System.out.println(name +" with rollnumber "+id+" has an age of "+age);

	}
	
	
	SchoolStudent percentage()
	{
	    // 'this.percentage' refers to the instance variable of the current object,
	    // ensuring we are updating the object's own 'percentage' field.
		
		this.percentage =(marks/100)*100 ;// Return current class instance
		

	    // 'return this;' returns the current object itself,
	    // allowing method chaining or continued use of this object.
		return this;	
	}
	
	// this can be passed as an argument in the method
	void details() {
		printInfo(this);
	}
	
	void printInfo(SchoolStudent s) 
	{
		System.out.println("\n\t\tDetails");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+id);
		System.out.println("age : "+age);
		System.out.println("Marks : "+marks);
		
		//System.out.println("Percentage : "+percentage()); -> so instead of calling 
		//directly we will invoke the method
		//calling percentage() method, which returns the SchoolStudent object (this)
		//— not the actual numeric percentage value.
		
		// to invoke current class method 
		// this is automatically added at the beginning of the method by the java compiler
		this.percentage(); 
		System.out.println("Percentage : "+percentage);
		
		
	}
	
	// to pass this as an arg in the constructor call
	void sendToProfile()
	{
		Profile p = new Profile(this);
		p.profile();
	}

}

public class Studentss {

	public static void main(String[] args) {
		
		SchoolStudent ss0 = new SchoolStudent();
		ss0.details();
		ss0.sendToProfile();
//		ss0.printInfo();
//		SchoolStudent ss1 = new SchoolStudent("Anu",15,2);
//		ss1.printInfo();
		
		

	}

}
