package StringPractice;
import java.util.Scanner ;

public class Palindrome {

	public static void main(String[] args) {
		
		//palindrome or not
		
		String str ;
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		boolean isPalindrome = true;
		
		int n =str.length();
		
		for(int i = 0; i <= n/2 ; i++)
		{
			if(str.charAt(i) != str.charAt(n-i-1))
			{
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome == true)
			System.out.println(str+ " is Palindrome");
		else
			System.out.println(str+ " is not Palindrome");

	}

}
