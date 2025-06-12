package loopstmt;

public class primeInRange {

	public static void main(String[] args) 
	{
		// Prime numbers from 1 to 100
		
		System.out.println("Prime numbers from 1 to 100:");
	
		for( int i = 1 ; i <= 100 ; i++)
		{
			boolean  isPrime = true;

			if (i == 1)
			{
				 isPrime = false;
			}
			  
			
			else 
			{
				for(int j = 2 ; j <= i / 2 ;j ++)
				{
					if ( i % j == 0) 
					{
						 isPrime = false ;
						break;
					
					}
				
				}
				
				if( isPrime == true )
					System.out.println(i);
			}
			
		}
		
		
		
	

	}

}
