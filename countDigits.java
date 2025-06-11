package loopstmt;

public class countDigits {

	public static void main(String args[])
	{
		int num= 123456789;
		int rem = 0;
		int count = 0;
		while(num!=0)
		{
			rem= num % 10 ;
			count ++;
			num = num / 10;
		}
		
		System.out.println(" No of a digit in a number : " +count);
	}
}
