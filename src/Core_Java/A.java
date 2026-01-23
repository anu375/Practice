package Core_Java;

public class A 
{

	A()
	{
		System.out.println("A Constructor ");
	}
	
}

class B extends A
{
	B()
	{
		super();
		System.out.println("B Constructor");
	}
	
	public static void main(String[] args)
	{
		new B();
	}
}