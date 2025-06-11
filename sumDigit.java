package loopstmt;

public class sumDigit {

	public static void main(String[] args) {
		// Finding the sum of digits of a number
		int num=567;
		int rem = 0;
		int sum = 0;
		while(num!=0)
		{
			rem= num % 10 ;
			sum += rem ;
			num = num / 10;
		}
		
		System.out.println(" No of a digit in a number : " +sum);

	}

}
