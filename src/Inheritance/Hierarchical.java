package Inheritance;

public class Hierarchical 
{

	public static void main(String[] args) 
	{
		
		Shape s = new Shape();
		s.draw();
		System.out.println("*********");
		
		Circle c = new Circle();
		c.area_1();
		System.out.println("*********");
		
		Rectangle r = new Rectangle();
		r.draw();
		r.area();

	}

}

class Shape
{
	void draw()
	{
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape
{
	void area_1()
	{
		System.out.println("Circle area");
	}
}

class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Rectangle area");
	}
}