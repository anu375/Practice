package Core_Java;

public class Test_1 
{
	
	static
	{
		System.out.println("Static Block...");
	}
	
	
	Test_1()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance Block...");
	}
	
	public static void main(String[] args)
	{
		new Test_1();
	}
	
}
