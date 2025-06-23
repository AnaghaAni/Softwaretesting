package oops;

class Studentss1
{
	String name ;
	int age ;
	int marks;
	Studentss1(String name, int age){
		this.name= name;
		this.age= age;
		
	}
	Studentss1(String name, int age,int marks){
		this.name= name;
		this.age= age;
		this.marks = marks;
		
	}
	void printInfo() 
	{
		System.out.println("\n\t\tDetails");
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Marks : "+marks);
	}
}


public class ConstructorOverloading {

	
		public static void main(String[] args) {
	        Studentss1 s= new Studentss1("anu",10);
	        s.printInfo();
	        Studentss1 s1= new Studentss1("arun",11,90);
	        s1.printInfo();
	    

	}

}
