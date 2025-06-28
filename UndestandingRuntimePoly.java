package Polymorphism;

class Animal {
	static void sound() {
		System.out.println("Animal makes sound");
	}
	void eat() {
		System.out.println("dog eates");
	}
	//Parent doesn't consider child
	//but child  cares about parent 
}

class Dog extends Animal
{
	static void sound() {
		System.out.println("Dog makes sound");
	}
}
class Cat extends Animal
{
	static void sound() {
		System.out.println("Cat makes sound");
	}
}
public class UndestandingRuntimePoly {

	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.sound();
		Animal a = new Dog(); //upcasting
		// here the obj of dog  is created
		//but the reference of animal is created
		//Upcasting is the process of treating a child class object as if it were an object of its parent class.
		//Upcasting: Child -> Parent reference assignment.
		//Only parent class methods can be accessed directly.
		a.sound();

	}

}
