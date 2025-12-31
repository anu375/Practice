package Abstraction;

public class Lambda_Test 
{

	public static void main(String[] args)
	{
		
		Calculator_1 c = (a,b) -> a + b;
		System.out.println(c.calculate(10,20));

	}

}

interface Calculator_1
{
	int calculate(int a, int b);
}