package Abstraction;

public class Area_Calculator
{

	public static void main(String[] args)
	{
		
		Shape shape;
		
		shape = new Circle();
		System.out.println("Circle Area : "+shape.area());
		
		shape = new Rectangle();
		System.out.println("Rectangle Area : "+shape.area());

	}

}

abstract class Shape
{
	abstract double area();
}

class Circle extends Shape
{
	double r = 5;
	
	double area()
	{
		return 3.14 * r * r;
	}
}

class Rectangle extends Shape
{
	double l = 10, b = 5;
	
	double area()
	{
		return l * b;
	}
}