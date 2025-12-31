package Polymorphism;

public class First
{

	public static void main(String[] args)
	{
		
		Operation add = (a, b) -> a + b;
		Operation mul = (a, b) -> a * b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(mul.calc(10, 20));

	}

}

interface Operation
{
	int calc(int a, int b);
}