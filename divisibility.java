package loopstmt;

public class divisibility {

	public static void main(String[] args) {
		//Numbers divisible by both 3 and 5 
		
		System.out.println("Numbers divisible by both 3 and 5 :");	
		
		for(int i = 1; i <= 100; i++)
		{

			if( i % 3 == 0 && i % 5 == 0)
				System.out.println(i);
		}

	}

}
