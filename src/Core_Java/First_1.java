package Core_Java;

public class First_1 
{
	static void display()
	{
		System.out.println("Parent Static");
	}
}

class First_2 extends First_1
{
	static void display()
	{
		System.out.println("Child Static");
	}
	
	public static void main(String[] args)
	{
		
	}
}