package Multithreading;

public class First extends Thread
{
	
	public void run()
	{
		System.out.println("Thread Running...");
	}
	public static void main(String[] args) 
	{
		
		First first = new First();
		first.start();

	}

}

