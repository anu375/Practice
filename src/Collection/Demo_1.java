package Collection;

public class Demo_1 
{

	/**
	 * method overriding(Runtime polymorphism)
	 */
	
	void show()
	{
		System.out.println("Parent Class Method");
	}
}

class Demo_2 extends Demo_1
{
	void show()
	{
		System.out.println("Child Class Method");
	}
	
	public static void main(String[] args)
	{
		Demo_1 d = new Demo_2();
		d.show();
	}
}