package oops;

class Student 
{
	String name;
	int age;
	int id;
	Student(){
		System.out.println("constructor");
	}
	Student(String name, int age,int id){
		
		this.name = name;
		this.age = age ;
		this.id = id;
		

	}
	Student (Student s)
	{
		this.name = s.name;
		this.age = s.age ;
		this.id = s.id;
		System.out.println(s.name);
		System.out.println("copy");
	}
	void printInfo() 
	{
		System.out.println("Details");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+id);
		System.out.println("age : "+age);
	
		
		
	}
}

public class UnderstandingConstructor {

	public static void main(String[] args) {
		Student s1 = new Student ();
		s1.name="a";
		s1.id=13;
		s1.age=15;
//		s1.printInfo();
		Student s2 = new Student ("anu",23,12);
		System.out.println(s2.name);// so here we not assign to the variable
		
		Student s3 = new Student(s2);
		s3.printInfo();
	}

}
