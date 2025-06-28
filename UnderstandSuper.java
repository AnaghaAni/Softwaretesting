package Inheritance;
class Parent
{
	int a = 101;
	
	void newMethod()
	{
		System.out.println("Parent Method");
	}
	
	Parent()
	{
		System.out.println("Parent class");
	}
	
	Parent(int a)
	{
		this.a = a;
	}
	
}
class Child extends Parent
{
	int a = 10;
	Child(){
		System.out.println("Child class");
	}
	
	Child(int a){
		super(a);
		this.a = a;
	}
	void newMethod()
	{
		//refers immediate parent Class instance var
		System.out.println("Child Method");
	}
	
	void display()
	{
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
}
public class UnderstandSuper {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.newMethod();
		c.display();
		
		Child c1 = new Child(50);
		c1.newMethod();
		c1.display();
	}

}
