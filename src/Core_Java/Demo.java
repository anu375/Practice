package Core_Java;

public class Demo 
{
/**
 * method overloading (compile-time polymorphism)
 */
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.add(10,20);
		demo.add(10.5, 20.5);
	}
	
}
