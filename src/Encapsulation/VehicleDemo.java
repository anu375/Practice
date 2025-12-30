package Encapsulation;

public class VehicleDemo
{

	public static void main(String[] args)
	{
		
		Vehicle vehicle = new Vehicle();
		vehicle.accelerate();
		System.out.println("Speed : "+vehicle.getSpeed());

	}

}

class Vehicle
{
	private int speed;
	
	public void accelerate()
	{
		speed += 10;
	}
	
	public int getSpeed()
	{
		return speed;
	}
}