package method;

public class MethodScope {
	public  void Message()
	{
		String msg ="Java programming";
		System.out.println(msg); // // Local variable (method scope)
		
	}
	 public void sum (int a, int b)
	{
		 int sum = a+b;
		 System.out.println(sum);
			
	}

	public static void main(String[] args) {
		
		MethodScope ms1 = new MethodScope();
		ms1.Message();
		
//		System.out.println(msg);   //Error: msg not accessible here
		
		
		ms1.sum(20,30);
//		System.out.println(sum); //Error: sum is out of scope

	}

}
