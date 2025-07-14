package EduSmart;

public class Course {
//Private data member - encapsulation
	private String title;
	
	int durationInHours;
	
	// Final variable - value cannot be changed once assigned
	final int maxStudents = 10;
	
	// Getter for title (Encapsulation)
	public String getTitle()
	{
		return title;
	}
	
	
	// Setter for title (Encapsulation)
	public void setTitle( String title)
	{
		this.title = title;
		
	}
	
	
	// Constructor Overloading:
 // Constructor to initialize only title
	Course(String title)
	{
		this.title = title;
	}
	
	// Constructor to initialize title and duration
	Course(String title,int durationInHours)
	{
		this.title = title;
		this.durationInHours = durationInHours;
		
	}
	
	// Method to show course details
	void ShowCourse()
	{
		System.out.println("\n\t\t\t Course Details \n");
		System.out.println("\tCourse Name : "+title);
		if (this.durationInHours == 0) 
	        System.out.println("\tCourse Duration: Not yet started");
	    else 
	        System.out.println("\tCourse Duration: " + durationInHours);
		System.out.println("\tMaximum Student : "+maxStudents);
	}
}



