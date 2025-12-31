package Inheritance;

public class Multiple_Interface_Inheritance
{

	public static void main(String[] args) 
	{
		
		Mobile mobile = new Mobile();
		mobile.click();
		mobile.play();

	}

}

interface Camera
{
	void click();
}

interface Music
{
	void play();
}

class Mobile implements Camera, Music
{
	public void click()
	{
		System.out.println("Photo Clicked");
	}
	
	public void play()
	{
		System.out.println("Music Playing");
	}
}