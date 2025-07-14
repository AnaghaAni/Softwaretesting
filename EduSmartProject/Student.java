package EduSmart;

public class Student extends User implements ProgressTrackable  
{
	Course enrolledRef1;
	Course enrolledRef2;
	int countEnrollCourses ;
	
	// Fields to store up to two enrolled courses
	private String enrolledCourse1;
	private String enrolledCourse2;
	 // Private progress counters for each course
	private int progressCnt1;
	private int progressCnt2;
	
	
	
	 // Setters for course progress (Encapsulation)
	public void setProgressCnt1( int progressCnt1)
	{
		this.progressCnt1 =progressCnt1;
	
	}
	
	
	public void setProgressCnt2( int progressCnt2)
	{
		this.progressCnt2 =progressCnt2;		
	}
	
	//Getters for course progress (Encapsulation)
	
	public int getProgressCnt1( )
	{
		return progressCnt1 ;
	}
	
	public int getProgressCnt2( )
	{
		return progressCnt2 ;
	}
	
	
	 // Constructor using super() to initialize User fields (Inheritance)
	
	Student(String name, String email, String UserId)
	{
		super(name, email, UserId);
		this.enrolledRef1 = null;
		this.enrolledRef2 = null;
	}
	
	
	// Method to enroll in a course (max 2)
	public void enrollCourse(Course c)
	{
		
		if(enrolledRef1 == c || enrolledRef2 == c)
		{
			System.out.println("\nAlready enrolled in this course.");
		}
		else 
		{
			if(enrolledRef1 == null)
			{
				this.enrolledRef1 = c;
				this.enrolledCourse1 = c.getTitle();
				countEnrollCourses++;
				System.out.println("\n"+super.getName() +" is enrolled in "+enrolledRef1.getTitle());
			}
				
			else if( enrolledRef2 == null)
			{
				this.enrolledRef2 = c;
				this.enrolledCourse2 = c.getTitle();
				countEnrollCourses++;
				System.out.println("\n"+super.getName() +" is enrolled in "+enrolledRef2.getTitle());
			}

			else if( countEnrollCourses >= 2)
			{
				System.out.println("\n"+"Enrolled Courses \n");
				System.out.println("1. "+enrolledCourse1);
				System.out.println("2. "+enrolledCourse2);
				System.out.println("Cannot enroll more than 2 courses");
			}
			
		}
		

	
	}
	
	
	// Display enrolled courses
	public void showingEnrolledCourses()
	{
		if(enrolledRef1!=null)
		{
			if(enrolledCourse1.equals(enrolledRef1.getTitle()))
			{
				System.out.println("\t\t1. "+enrolledCourse1);
			}
			else
			{
				System.out.println("\t\t1. This course has been removed.");

			}
		}
		if(enrolledRef2!=null)
		{
			if(enrolledCourse2.equals(enrolledRef2.getTitle()))
			{
				System.out.println("\t\t2. "+enrolledCourse2);
			}
			else
			{
				System.out.println("\t\t2. This course has been removed.");

			}
		}
        if (enrolledCourse1 == null && enrolledCourse2 == null)
            System.out.println("\t\tNo courses enrolled yet.");
			
	}

	
	  // Override method from abstract class to display profile (Polymorphism)
	public  void viewProfile()
	{
		super.displayWelcome();
		System.out.println("\n\t\t\t Student Profile \n");
		System.out.println("\tName: "+getName());
		System.out.println("\tEmail: "+getEmail());
		System.out.println("\tUserId: "+getUserId());
		System.out.println("\tEnrolled Courses : ");
		showingEnrolledCourses();
		
	}
	
	
	// Update progress based on course title 
	public void upDateProgress(Course c, int progress)
	{
        if (enrolledRef1 == c)
            progressCnt1 = progress;
        else if (enrolledRef2 == c)
            progressCnt2 = progress;
        else
            System.out.println("Course is not enrolled for the student.");

	}
	
	
	
	// Implementation of interface method to show progress (Polymorphism)
	public void trackProgress()
	{
		 System.out.println("\n\tProgress Report for " + getName()+"\n");
		 if (enrolledRef1 != null)
		 {
			 if(enrolledCourse1.equals(enrolledRef1.getTitle()))
			 {
				 System.out.println("\t\t" + enrolledRef1.getTitle() + ": " + progressCnt1 + "% completed");
			 }
			 else
			 {
				 System.out.println("\t\t1. Course has been removed.");
			 }
			
		 }
		 
		 if (enrolledRef2 != null)
		 {
			 if(enrolledCourse2.equals(enrolledRef2.getTitle()))
			 {
				 System.out.println("\t\t" + enrolledRef2.getTitle() + ": " + progressCnt2 + "% completed");
			 }
			 else
			 {
				 System.out.println("\t\t2. Course has been removed.");
			 }
			
		 }
		 
		 if (enrolledCourse1 == null && enrolledCourse2 == null)
			 System.out.println("\t\tNo courses enrolled yet.");
	}
}


