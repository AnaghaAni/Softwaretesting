package oops;


class Students
{
	String name ;
	int roll ;
	float marks ;
	
	// So the parameters and the instance variable initialization can't be same
	Students(String n, int r, float m){
		
		name = n ;
		roll = r ;
		marks = m ;	
		
	}
	
	void displayInfo() 
	{
		System.out.println("Details");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll);
		System.out.println("Marks : "+marks);
	
		
		
	}
	boolean isPassed()
	{
		if(marks > 40)
			return true ;
		else
			return false ;
	}
	
}


public class PracticeClassesObjects {

	public static void main(String[] args) {
		
		
		Students s1 = new Students("Anu",10,90.5f);
		s1.displayInfo();
		System.out.println("Grade : " +(s1.isPassed() ? "Passed" : "Failed"));
		System.out.println("\n");
		
		Students s2 = new Students("Ramu",20,80f);
		s2.displayInfo();
		System.out.println("Grade : " +(s2.isPassed() ? "Passed" : "Failed"));
		System.out.println("\n");
		
		Students s3 = new Students("Anju",11,35f);
		s3.displayInfo();
		System.out.println("Grade : " +(s3.isPassed() ? "Passed" : "Failed"));
		System.out.println("\n");
		
		
		

	}

}
