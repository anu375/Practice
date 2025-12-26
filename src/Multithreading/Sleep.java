package Multithreading;

public class Sleep extends Thread
{
	
	public void run()
	{
		System.out.println("*****");
		try
		{
			Thread.sleep(1500);
			System.out.println("After Sleep..");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
//		Sleep sleep = new Sleep();
//		sleep.start();
		new Sleep().start();
	}

}
