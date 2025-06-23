package oops;



class BankAccount 
{
	int accountNumber;
	String holderName; 
	double balance ;
	
	BankAccount()
	{
		this(0,"Un Named",0);
	}
	
	BankAccount(int accountNumber, String holderName, float balance)
	{
		this.accountNumber = accountNumber;
		this.holderName =  holderName ;
		this.balance = balance ;
	}
	void printBalanceDetails(BankAccount ac)
	{
		System.out.println("Account Number: " + accountNumber + 
                "\nHolder Name  : " + holderName + 
                "\nBalance      : ₹" + balance);
	}
	
	void deposit(double amount)
	{
		if(amount > 0)
		{
			this.balance = this.balance + amount ;
			System.out.println("\n\t\tAmount deposited successful!\n");
			printBalanceDetails(this);
		}
		else
			System.out.println("Enter an amount greater than zero !!");
			
	}
	
	void withdrawal(double amount)
	{
		if(amount <= balance)
		{
			this.balance = this.balance - amount ;
			System.out.println("\n\t\tWithdrawal successful!\n");
			printBalanceDetails(this);
			
		}
		else if ( amount <= 0)
			System.out.println("Enter an amount greater than zero !!");
		else if (amount > balance )
			System.out.println("Insufficient balance");
	}
	
	void transferTo(BankAccount receiver, double amount)
	{
		System.out.println("\nTransferring ₹" + amount + " from " + this.holderName + " to " + receiver.holderName);
		this.withdrawal(amount);
		receiver.deposit(amount);
	}
	
	
}

public class BankingSystemImp {

	public static void main(String[] args) {
		
		 BankAccount acc0 = new BankAccount();
		 acc0.printBalanceDetails(acc0);
		
		 BankAccount acc1 = new BankAccount(100123456, "Anu Sharma", 50000);
		 acc1.deposit(3000);
		 acc1.withdrawal(1000);
		
		 BankAccount acc2 = new BankAccount(200987654, "Priya Das", 75000);
	     acc2.deposit(5000);    
	     acc2.withdrawal(2500);
	     
	     BankAccount acc3 = new BankAccount(208740854, "Arun Kumar", 75000);
	     acc3.deposit(9000);    
	     acc3.withdrawal(3500);
	     
	     acc2.transferTo(acc3,25000);
		

	}

}
