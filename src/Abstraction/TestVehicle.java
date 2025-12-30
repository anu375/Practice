package Abstraction;

public class TestVehicle
{

	public static void main(String[] args) 
	{
		 
		Vehicle v;
		
		v = new Bike();
		v.start();
		v.fuel();
		
		v = new Car();
		v.start();

	}

}

abstract class Vehicle
{
	abstract void start();
	
	void fuel()
	{
		System.out.println("Fuel is filled");
	}
}

class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike starts with kick");
	}
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car starts with key");
	}
}