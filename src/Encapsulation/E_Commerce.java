package Encapsulation;

public class E_Commerce
{

	public static void main(String[] args)
	{
		
		Order order = new Order();
		order.shipOrder();
		System.out.println(order.getStatus());

	}

}

class Order
{
	private String status = "Placed";
	
	public void shipOrder()
	{
		status = "Shipped";
	}
	
	public String getStatus()
	{
		return status;
	}
}