package oops;

class ClgStudent
{
	String name;
	int id;
	ClgStudent(String name, int id)
	{
		this.name= name;
		this.id = id;
	}
	ClgStudent()
	{
		this("ram",27);
	}
	void printInfo() 
	{
		System.out.println("Details");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+id);
		
	
	}
	
//	void display(ClgStudent cgs)
	
}

public class UnderstandingThis {

	public static void main(String[] args) 
	{
		
		ClgStudent cg1 = new ClgStudent("anu",26);
		cg1.printInfo();
		
		// if we do not create a constructor default constructor would be invoked 
		ClgStudent cg2 = new ClgStudent();
		cg2.printInfo();
		
		ClgStudent cg3 = new ClgStudent("jin",28);
//		cg3.printInfo();
	}

}
