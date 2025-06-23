package atmproject;
import java.util.*;

public class atmPrj {
	public static void main(String args[]) 
	{
		
		float balance = 10000;
		float withdraw ;
		float deposit ;
	
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
					System.out.println("Welcome to ATM");
					System.out.println("Choose the option");
					System.out.println("1. Balance");
					System.out.println("2. Withdraw Cash");
					System.out.println("3. Deposit");
					System.out.println("4. Exit");
					
					int choice = sc.nextInt();
					
					switch(choice) 
					{
						case 1 :System.out.println("Balance Amount: " +balance);
									break;
						case 2: {
									System.out.println("Enter the amount:");
									withdraw= sc.nextFloat();
									if(balance < withdraw)
										System.out.println("Insufficient balance");
									else if (withdraw <= 0)
										System.out.println("Enter a valid amount");
									else
									{
										balance = balance - withdraw;
										System.out.println("Withdrawal successful!");
									}
								
							   }
							   break;
							
						case 3:
								{
									System.out.println("Enter the amount to deposit");
									deposit = sc.nextFloat();
									if(deposit > 0) 
									{
										balance = balance + deposit;
										System.out.println("Amount deposited successful!");
									}
										
									else
										System.out.println("Enter an amount greater than zero !!");
									
								}
								
								break;
								
						case 4: System.out.println("Thankyou for using the ATM. GoodBye !!!");
								System.exit(0);
								break;
							
						default : System.out.println("Invalid option !! please enter a valid option");
						
				
				
			}
		}
	}

}
	
