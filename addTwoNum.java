package method;

public class addTwoNum {
 
	//Function with no return type and no parameters
	public static void sum()
	{
			int a = 10 ;
			int b = 20 ;
			int sum = a + b ;
			System.out.println("The sum of two numbers : " +sum);
	}
	
	
	
	// Funtion with no parameter and  return type
	
	public static int difference()
	{
			int a = 30 ;
			int b = 20 ;
			int diff = a - b ;
			return diff ;
	}
	
	
	//Funtion with no return type and with parameters
	public static void product(int a, int b)
	{
		
			int product = a * b ;
			System.out.println("The product of two numbers : " +product);
			
	}
	
	
	
	
	//Funtion with  return type and with parameters
	
	public static int division(int a, int b)
	{
		
			int quo = a / b ;
			return quo ;
			
	}
	
	
	
	public static void main(String args[])
	{
		sum(); //Function call
		
		
		int diff = difference() ; // the function will return a value, 
		//this needs be to stored either in a variable or printed
		
		System.out.println("The Difference of two numbers : " +diff);
		
		
		// function call by passing parameters
		product(5,4);
		
		
		int quo = division(8,4) ; //Function call with parameter  and returning a value
		System.out.println("The division of two numbers : " +quo);
		
	}


}
