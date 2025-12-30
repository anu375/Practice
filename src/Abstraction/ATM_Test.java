package Abstraction;

public class ATM_Test
{

	public static void main(String[] args) 
	{
	
		ATM atm;
		
		atm = new SBIATM();
		atm.withdraw();
		atm.checkBalance();
		
		atm = new HDFCATM();
		atm.withdraw();
		atm.checkBalance();

	}

}

abstract class ATM
{
	abstract void withdraw();
	abstract void checkBalance();
}

class SBIATM extends ATM
{
	public void withdraw()
	{
		System.out.println("Withdraw from SBI ATM");
	}
	
	public void checkBalance()
	{
		System.out.println("Checking balance from SBI ATM");
	}
}

class HDFCATM extends ATM
{
	public void withdraw()
	{
		System.out.println("Withdraw from HDFC ATM");
	}
	
	public void checkBalance()
	{
		System.out.println("Checking balance from HDFC ATM");
	}
}