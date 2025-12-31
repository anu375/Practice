package Inheritance;

public class Constructor_Inheritance 
{

	public static void main(String[] args)
	{
		
		A a = new B();
		System.out.println(a);

	}

}

class A
{
	A()
	{
		System.out.println("A Constructor");
	}
	
//	public String toString()
//	{
//		return "A";
//	}
}

class B extends A
{
	B()
	{
		super();
		System.out.println("B Constructor");
	}
	
//	public String toString()
//	{
//		return "B";
//	}
}