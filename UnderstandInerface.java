package Abstraction;

interface vehicle{
	public  void start(); //no need of abstract keyword
}

class car implements vehicle
{
	public void start()
	{
		System.out.println("vehicle running");
	}
}

public class UnderstandInerface {

	public static void main(String[] args) {
		
		vehicle v = new car();
		v.start();
	}

}
