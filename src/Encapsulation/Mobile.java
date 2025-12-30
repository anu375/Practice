package Encapsulation;

public class Mobile 
{

	public static void main(String[] args)
	{
		
		Mobile_1 mobile = new Mobile_1();
		mobile.increaseVolume();
		System.out.println("Volume : "+mobile.getVolume());

	}

}

class Mobile_1
{
	private int volume = 5;
	
	public void increaseVolume()
	{
		volume++;
	}
	
	public int getVolume()
	{
		return volume;
	}
}