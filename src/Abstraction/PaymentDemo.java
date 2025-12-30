package Abstraction;

public class PaymentDemo 
{

	public static void main(String[] args)
	{
		
		Payment p;
		
		p = new GooglePay();
		p.pay();
		
		p = new PhonePay();
		p.pay();

	}

}

interface Payment
{
	void pay();
}

class GooglePay implements Payment
{
	public void pay()
	{
		System.out.println("Payment via Google Pay");
	}
}

class PhonePay implements Payment
{
	public void pay()
	{
		System.out.println("Payment via Phone Pay");
	}
}