package Multithreading;

public class Join  extends Thread
{
	
	public void run()
	{
		System.out.println("Child Thread..");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		
		Join t = new Join();
		t.start();
		t.join();
		System.out.println("Main Thread..");
	}

}
