package StringPractice;

public class CountingVowels 
{

	public static void main(String[] args) 
	{
		
				// Counting the no of vowels in a String
			
				String str ="Hello how are you doing today?";
				
				int count = 0;
				
				
				for( int i = 0; i < str.length() ;i++)
				{
					if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
						|| str.charAt(i) == 'O'	|| str.charAt(i) == 'U')
				
						count ++;
					
				}
				
				
				System.out.println("No of vowels :" +count);
							
	}
}

	