package Core_Java;

public class Constructor_Chaining
{

	Constructor_Chaining()
	{
		this(10);
		System.out.println("Default::::");
	}
	
	Constructor_Chaining(int x)
	{
		System.out.println("Parameterized::::"+x);
	}
	
	public static void main(String[] args)
	{
		new Constructor_Chaining();
	}
	
}
