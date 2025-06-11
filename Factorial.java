package loopstmt;

public class Factorial {
	public static void main(String args[])
	{
		int num = 1;
		int fact=1;
		while ( num <= 5 )
		{
			fact*= num ;
			num ++;
			
		}

		System.out.println("Factorial of number " +fact)	;
	}
}
