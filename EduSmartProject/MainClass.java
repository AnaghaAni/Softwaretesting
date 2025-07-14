package EduSmart;

public class MainClass 
{
	public static void main(String[] args) {

	    //1. Create courses using both constructors
	    Course c1 = new Course("Python Programming", 10);
	    Course c2 = new Course("Artificial Intelligence", 10);
	    Course c3 = new Course("Automation Testing", 20);
	    Course c4 = new Course("Core Java", 20);
	    Course c5 = new Course("Manual Testing");

	   
	    // Show course details
	    c1.ShowCourse();
	    c2.ShowCourse();
	    c3.ShowCourse();
	    c4.ShowCourse();
	    c5.ShowCourse();

	    // Instructor creating courses
	    Instructor i1 = new Instructor("Sree Hari", "hari@gmail.com", "In100");
	    Instructor i2 = new Instructor("Anjali", "anjali@gmail.com", "In101");

	    i1.CreateCourse(c1);  // Python
	    i1.CreateCourse(c2);  // AI
	    i1.CreateCourse(c3);  // Exceeds limit

	    i2.CreateCourse(c3);  // Automation
	    i2.CreateCourse(c4);  // Java
	    i2.CreateCourse(c5);  // Exceeds limit

	    i1.viewProfile();
	    i2.viewProfile();

	    // Students enrolling in courses
	    Student s1 = new Student("Athul Krishna", "athul@gmail.com", "Std1000");
	    Student s2 = new Student("Diya", "diya@gmail.com", "Std1001");

	    // s1 Enrollments
	    s1.enrollCourse(c1);   // Python
	    s1.enrollCourse(c1);   // Duplicate
	    s1.enrollCourse(c2);   // AI
	    s1.enrollCourse(c3);   // Exceeds limit

	    // s1 Progress updates
	    s1.upDateProgress(c1, 90);
	    s1.upDateProgress(c2, 10);
	    s1.upDateProgress(c3, 0);  // Not enrolled

	    s1.viewProfile();
	    s1.trackProgress();

	    // s2 Enrollments
	    s2.enrollCourse(c3);   // Automation
	    s2.enrollCourse(c4);   // Java
	    s2.enrollCourse(c5);   // Exceeds limit

	    s2.upDateProgress(c3, 50);
	    s2.upDateProgress(c4, 90);
	    s2.upDateProgress(c5, 0);  // Not enrolled

	    s2.viewProfile();
	    s2.trackProgress();

	    // Admin Actions
	    Admin a1 = new Admin("Admin1", "admin1@gmail.com", "Ad1101");
	    Admin a2 = new Admin("Admin2", "admin2@gmail.com", "Ad2102");

	    a1.viewProfile();
	    a2.viewProfile();

	    a1.remove(s1);
	    a2.remove(s2);

	    // Using setters (encapsulation)
	    s1.setName("Athul Krishna G");
	    s1.setEmail("athulg@gmail.com");
	    s1.viewProfile();
//
//	    //Simulate course removal by changing title
	    c1.setTitle("Machine Learning");
	    i1.setcreatedCourse1(c1);
	    i1.CreateCourse(c1);
	    i1.viewProfile();
	    
//
	    s1.viewProfile();       // Course title mismatch should be shown
	    s1.setProgressCnt1(95); // Resetting progress manually
	    s1.upDateProgress(c1, s1.getProgressCnt1());
	    s1.trackProgress();
//	    
	  
     }




}


