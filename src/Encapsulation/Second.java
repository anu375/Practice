package Encapsulation;

public class Second 
{

	public static void main(String[] args)
	{
		
		BankAccount acc = new BankAccount();
		acc.deposite(5000);
		System.out.println("Balance : "+acc.getBalance());

	}

}

class BankAccount
{
	private double balance;
	
	public void deposite(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
	}
		
	public double getBalance()
	{
		return balance;
	}
}
