package StringPractice;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {
	
	// Converts each word's First letter to upper case
		
			// Read the String
			String str ;
			
			System.out.println("Enter String : ");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
			
			String upper = " ";
			int n= str.length();
			
			int i=0 ;
			
			while(i < n)
			{
					// Capitalize the first character
					if( i==0)
					{
						char ch = Character.toUpperCase(str.charAt(i));
						upper += ch;
					}
						
					else if(str.charAt(i) == ' ' &&  i+1 < n) 
					{
						
						upper +=str.charAt(i) ;// add space
						char ch = Character.toUpperCase(str.charAt(i+1));
						upper += ch;
						i++; // skip next since already added
					}
					
					else
					{
						upper +=str.charAt(i); 
					}
								 
					i++;
					
			}
			
			System.out.println("Title Case String: " +upper);

	}

}
