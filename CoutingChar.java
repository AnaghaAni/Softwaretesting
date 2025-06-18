package StringPractice;

import java.util.Scanner;

public class CoutingChar {

	public static void main(String[] args) {
		
		// Count how many times a character appears in the string
		
		String str ;
		int count = 0;
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		System.out.println("Enter the character to count the occurrence");
		char c = sc.next().charAt(0);
		
		for(int i = 0 ; i < str.length(); i++)
		{
			if(str.charAt(i) == c)
				count++ ;
		}
		
		System.out.println(c+" occurred " +count+" in the " +str);

	}

}
