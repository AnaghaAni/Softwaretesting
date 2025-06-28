package Abstraction;

abstract class BankAccount
{
	String accountHolder;
	double balance;
	BankAccount(String accountHolder,double balance)
	{
		this.accountHolder = accountHolder;
		this.balance= balance;
	}
	
	void showBalance()
	{
		System.out.println(accountHolder+" has  balance of "+balance);
	}
	
	abstract  void calInterest();
}
class SavingAcc extends BankAccount
{
	SavingAcc(String accountHolder,double balance)
	{
		super(accountHolder,balance);
	}
	
	@Override
	void calInterest()
	{
		double interest = balance * 0.04;
		System.out.println("Saving Account balance:"+interest);
	}
}

class CurrentAcc extends BankAccount
{
	CurrentAcc(String accountHolder,double balance)
	{
		super(accountHolder,balance);
	}
	
	void calInterest()
	{
		
		System.out.println("No interest calculated in current Account");
	}
}
public class UnderstandAbstract2 {

	public static void main(String[] args) {
		
		SavingAcc s = new SavingAcc("Karuna",10000);
		s.calInterest();
		s.showBalance();
		
		CurrentAcc c = new CurrentAcc("anju",10000);
		c.calInterest();
		c.showBalance();
	}

}
