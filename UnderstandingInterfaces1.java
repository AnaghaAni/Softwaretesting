package Abstraction;



interface Engine {
    void start();  // abstract method
    void stop();   // abstract method
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine Implementation for start feature");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Implementation for stop feature");
    }
}

class DieselEngine implements Engine {
	public void start() {
        System.out.println("Diesel Engine Implementation for start feature");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine Implementation for stop feature");
    }
}

class Cars
{
	Engine E ;
	Cars(Engine E)
	{
		this.E = E;
	}
	
	void drive()
	{
		  E.start();
        System.out.println("Car is now running...");
//        E.stop();
	}
	
}

public class UnderstandingInterfaces1 {

	public static void main(String[] args) {
		
//	       Engine engine1 = new PetrolEngine();
//	        engine1.start();
//	        engine1.stop();
//
//	        Engine engine2 = new DieselEngine();
//	        engine2.start();
//	        engine2.stop();
		
		Engine engine3 = new PetrolEngine();
		Cars c2 = new Cars(engine3);
		c2.drive();
	}

}



