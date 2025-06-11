package loopstmt;

public class palindrome {
	public static void main(String args[])
	{
		// Palindrome of a number
		
		int num= 101;
		int rem = 0;
		int rev = 0;
		int org=num;
		while(num!=0)
		{
			rem= num % 10 ;
			rev =rev*10 + rem ;
			num = num / 10;
		}
		
		if(rev==org)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}

}
