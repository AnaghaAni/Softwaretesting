package loopstmt;

public class prime {

	public static void main(String[] args) {
		// Prime number or not
		
		boolean  isPrime = true;
		int n = 2 ;
		
		if (n == 0 || n == 1)
			 isPrime= false;
		
		for(int i = 2 ; i <= n / 2 ;i ++)
		{
			if ( n % i == 0) 
			{
				 isPrime = false ;
				break;
			
			}
		
		}
		
		if( isPrime == true )
			System.out.println(+ n + " is Prime");
		else
			System.out.println(+ n +" is Not Prime");

	}

}

