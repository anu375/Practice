package Multithreading;

public class Second implements Runnable
{
	
	public void run()
	{
		System.out.println("Runnable Thread..");
	}

	public static void main(String[] args) 
	{
		Thread t = new Thread(new Second());
		t.start();
	}

}
