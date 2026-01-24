package Core_Java;

public class Test_1 
{

	static
	{
		System.out.println("Static Block...");
	}
	{
		System.out.println("Instance Block...");
	}
	
	Test_1()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args)
	{
		new Test_1();
	}
	
}
