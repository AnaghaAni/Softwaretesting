package EduSmart;

//Abstract base class for all types of users (Student, Instructor, Admin)
public abstract class  User
{
	// Encapsulated user details (accessible via getters/setters only)
	private String name;
	private String email ;
	private String userId;
	
	//getter Methods
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	
	//Setter Methods
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public void setEmail(String email)
	{
		this.email = email;
		
	}
	
	public void setUserId(String userId)
	{
		this.userId=userId;
		
	}

	
	 // Parameterized constructor to initialize  object
	 User(String name, String email, String userId)
	 {
		 this.name = name;
		 this.email = email;
		 this.userId = userId;
	 }
	 
	 
	// Abstract method to be implemented by subclasses for showing profile
	 public abstract void viewProfile();
	 
	 
	 // Final method - cannot be overridden, common to all users
	 final void displayWelcome()
	 {
		 System.out.println("\n\t\t\t--Welcome to EduSmart LMS Portal!!--\n");
	 }
}
