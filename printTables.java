package loopstmt;

public class printTables {

	public static void main(String[] args) {
		
		// Print tables from 1 to 5
		
		System.out.println("Tables\n");
		
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println("Multiplication Table for "+i+"\n");
			for( int j = 1; j <=10 ; j++)
			{
				System.out.println(i + "*" +j +"=" + i*j);
			}
			
			System.out.println();
		}
		

	}

}
