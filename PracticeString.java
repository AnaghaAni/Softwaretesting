package StringPractice;

public class PracticeString {
	public static void main(String args[]) {
		
		// length of the string
		String str0="Hello";
		System.out.println("Length of the string :"+str0.length());
		
		String str1="Hello world  ";
		System.out.println("Length of the string :"+str1.length());
		
		
		String str2="Hi! Are you okay? Let's meet @ 5pm #park." ;
		System.out.println("Length of the string :"+str2.length());
		
		String str3="Hi! HOW ARE YOU ?" ;		
			
		//Returns a character at a specific index - charAt(index)
		System.out.println("character at the index : " +str2.charAt(2));
		System.out.println("character at the index : " +str2.charAt(4));
		
		
		//Returns a substring from start to end - 1 - substring(int start, int end)
		
		System.out.println(str2.substring( 4 )); //Specifies all the character starting from the index 4
		System.out.println(str2.substring( 4, 10)); // the end index is exclusive
		
		//Covert the string to upper case and lower case 
		System.out.println("Convert to upper case: " +str1.toUpperCase());
		System.out.println("Convert to Lower case: " +str3.toLowerCase());
		
		
		//Returns the first index of the character or substring - indexOf(char ch) or indexOf(String str)
		String str4 = "hellooee";
		System.out.println("Index of string: " +str4.indexOf('e'));
		System.out.println("Index of string: "+str4.indexOf("ll"));
		
		
		//Checks if the string contains a sequence - contains(CharSequence seq)
		System.out.println(str2.contains("@ 5pm"));
		System.out.println(str2.contains("@5pm"));
		
		
		//Replaces all occurrences.
		String str5="dear";
		System.out.println(str5.replace('a','e'));
		String str6="dear";
		System.out.println(str6.replace("ea","oo"));
		
		//Removes leading and trailing spaces. ->trim()
		String str7 ="     java    ";
		System.out.println(str7.trim());
		
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2) );   
		
		String s4 ="dear";
		String s3 ="dear";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4) );  
		
		String s5="hello";
		System.out.println(s5 == s1);
		System.out.println(s5.equals(s1) ); 
		
		
		
		
	
		
		
	}
}
