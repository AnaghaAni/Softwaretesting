package Abstraction;

// if a class has an abstract method, then it should be an abstract class
//Abstract class  is not meant to be instantiated directly
abstract class Animal
{
	// method doesn't have implementation, just declaration
	abstract void sound();
	
	//can have constructors, but called only via subclass
	Animal()
	{
		System.out.println(" Animal Abstract class is called ");
	}
	
	//Concrete methods (will have body)
	void sleep()
	{
		System.out.println("sleeping...");
	}
	void eat()
	{
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal
{
	Dog()
	{
		System.out.println(" Dog  class is called ");
	}
	
	void sound()
	{
		super.sleep();
		System.out.println("barking...");
	}
}

public class UnderstandAbstract {

	public static void main(String[] args) {
		
		//abstract class cannot create an obj
		//Animal a = new Animal()
		
		Animal a1 = new Dog();
		a1.sound();
		a1.sleep();
		
//		Dog d = (Dog)a1;
//		d.sound();
		
	}

}
