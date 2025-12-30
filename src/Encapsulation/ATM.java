package Encapsulation;

public class ATM 
{

	public static void main(String[] args) 
	{
		
		Atm_1 atm = new Atm_1();
		atm.withdraw(2000);
		System.out.println("Balance : "+atm.checkBalance());

	}


}

class Atm_1
{
	private double balance = 10000;
	
	public void withdraw(double amount)
	{
		
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdraw Successful");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	public double checkBalance()
	{
		return balance;
	}
}