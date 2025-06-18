package StringPractice;
import java.util.*;


public class ReverseString {

	public static void main(String[] args) {
		//Reversing the string
		
		String str ;
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		String strRev ="";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			strRev += str.charAt(i);
		}
		System.out.println("Reversed String : " +strRev);

	}

}
