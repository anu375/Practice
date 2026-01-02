package Polymorphism;

public class Combined_Example 
{
	public static void main(String[] args)
	{
		
		Vehicle_1 v = new Car_2();   //Polymorphism :- Parent class ref = Child class obj.
		v.setSpeed(80);    //Encapsulation
		v.run();           //Abstraction + Polymorphism
		
	}
}

abstract class Vehicle_1
{
	private int speed;    //Encapsulation
	
	public void setSpeed(int speed)
	{
		this.speed= speed;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	abstract void run();
}

class Car_2 extends Vehicle_1
{
	void run()
	{
		System.out.println("Car Running At Speed "+getSpeed());
	}
}