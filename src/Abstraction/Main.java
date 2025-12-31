package Abstraction;

public class Main 
{

	public static void main(String[] args)
	{
		
		PaymentService ps = new PaymentService();
		ps.makePayment(new UPI(), 500);

	}

}

interface Payment_1
{
	void pay(double amount);
}

class CreditCard implements Payment_1
{
	public void pay(double amount)
	{
		System.out.println("Paid : "+amount+" using Credit Card");
	}
}

class UPI implements Payment_1
{
	public void pay(double amount)
	{
		System.out.println("Paid : "+amount+" using UPI");
	}
}

class PaymentService
{
	void makePayment(Payment_1 p, double amount)
	{
		p.pay(amount);
	}
}