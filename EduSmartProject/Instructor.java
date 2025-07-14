package EduSmart;

public class Instructor extends User
{
	// Private fields to store titles of two created courses
	Course createdRef1;
	Course createdRef2;
	
	private String createdCourse1;
	private String createdCourse2;
	
	// Counter to keep track of how many courses the instructor has created
	int courseCount = 0;
	
	// Setter for createdCourse1 (Encapsulation)
	public void setcreatedCourse1(Course c)
	{
		this.createdCourse1 = c.getTitle();
		
	}
	
	// Setter for createdCourse2 (Encapsulation)
	public void setcreatedCourse2(Course c)
	{
		this.createdCourse2 = c.getTitle();
		
	}
	
	// Getter for createdCourse1
	public String getcreatedCourse1()
	{
		return createdCourse1;
	}
	
	// Getter for createdCourse2
	public String getcreatedCourse2()
	{
		return createdCourse2;
	}
	
	
	// Constructor to initialize Instructor using super() (Inheritance)
	Instructor(String name, String email, String UserId)
	{
		super(name, email, UserId);
		this.createdRef1 = null;
		this.createdRef2 =null;
	}
	
	

  // Method to create a course. Instructor can only create a maximum of 2.
	 public void CreateCourse( Course c)
	 {
		 if(courseCount >= 2 )
		 {
		     System.out.println("\nCannot create more courses. Limit reached!");
			 System.out.println("Course 1 : "+createdCourse1);
			 System.out.println("Course 2 : "+createdCourse2);
			 System.out.println("\n Only two course is allowed !! ");
		 }

		else if(createdRef1 == null)
		 {
			 this.createdRef1 = c;
			 this.createdCourse1 = createdRef1.getTitle();
			 System.out.println("\n"+ createdCourse1+" has been created");
			 courseCount++;
		 }
		 else if(createdRef2 == null)
		 {
			 
			 this.createdRef2 = c;
			 this.createdCourse2 = createdRef2.getTitle();
			 System.out.println("\n"+createdCourse2+" has been created");
			 courseCount++;
		 }
		
	 }
	
	 
	 //Method to show the list of courses created by the instructor
	 public void showListingCourses() {
		 if(createdRef1 != null)
		 {
			 if(createdCourse1.equals(createdRef1.getTitle()))
				 System.out.println("\t\t1. " + createdCourse1);
			 else
				 System.out.println("\t\t1. This course has been removed.");
		 }
		 if(createdRef2 != null)
		 {
			 if(createdCourse2.equals(createdRef2.getTitle()))
				 System.out.println("\t\t2. " + createdCourse2);
			 else
				 System.out.println("\t\t2. This course has been removed.");
		 }
		 if (createdRef1 == null && createdRef2 == null) 
		 {
	            System.out.println("\t\tNo courses created yet.");
	     }

	 }
		
	 
	// Overrides abstract method viewProfile() from User class (Polymorphism) 
	public  void viewProfile()
	{
		super.displayWelcome();
		System.out.println("\t\t\t Instructor Profile \n");
		System.out.println("\tName: "+getName());
		System.out.println("\tEmail: "+getEmail());
		System.out.println("\tUserId: "+getUserId());
		System.out.println("\tAvailable Courses: ");
		showListingCourses();

		
	
	}
}


