package method;
 class Car {

    //  class-scope variables  
    String model;        // instance field - each object
    static int total;    // static field   -  shared

    //constructor (has local scope parameters) 
    Car(String model) {
        this.model = model; // 'this' refers to the new object
        total++;            // increments shared counter
    }

    //  instance member method 
    void display() {              // needs an object
        int year = 2024;          // local variable
        System.out.println(model + " (" + year + ")");
    }

    // static member method
    static void showTotal() {     // no object needed
        System.out.println("Total cars: " + total);
    }


}

public class ClassScope {

	public static void main(String[] args) {
	
		 Car c1 = new Car("Tesla");
	     Car c2 = new Car("BMW");

	        c1.display();             // instance method call
	        Car.showTotal();          // static method call
	}

}
