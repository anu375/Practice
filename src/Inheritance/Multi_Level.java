package Inheritance;

public class Multi_Level 
{

	public static void main(String[] args) 
	{
		
		Vehicle_1 v = new Vehicle_1();
		v.start();
		System.out.println("***************");
		
		Car_1 c = new Car_1();
		c.start();
		c.drive();
		System.out.println("***************");
		
		Electric_Car ec = new Electric_Car();
		ec.start();
		ec.drive();
		ec.charge();

	}

}

class Vehicle_1
{
	void start()
	{
		System.out.println("Vehicle started..");
	}
}

class Car_1 extends Vehicle_1
{
	void drive()
	{
		System.out.println("Car driving..");
	}
}

class Electric_Car extends Car_1
{
	void charge()
	{
		System.out.println("Charging battery..");
	}
}