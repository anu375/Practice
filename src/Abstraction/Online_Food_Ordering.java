package Abstraction;

public class Online_Food_Ordering
{

	public static void main(String[] args)
	{
		
		Food_Order food_order;
		
		food_order = new Zomato();
		food_order.placeOrder();
		
		food_order = new Swiggy();
		food_order.placeOrder();

	}

}

interface Food_Order
{
	void placeOrder();
}

class Zomato implements Food_Order
{
	public void placeOrder()
	{
		System.out.println("Order placed via Zomato");
	}
}

class Swiggy implements Food_Order
{
	public void placeOrder()
	{
		System.out.println("Order placed via Swiggy");
	}
}