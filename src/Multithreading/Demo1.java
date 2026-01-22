package Multithreading;

public class Demo1
{

	public static void main(String[] args) throws InterruptedException
	{
		
		Thread th1 = new Thread(new myThread());
		Thread th2 = new Thread(new myThread());
		
		th1.setName("Thread-1");
		th2.setName("Thread-2");
		
		th1.start();
		th2.start();
		

	}

}


class myThread implements Runnable
{
	public void run()
	{
        System.out.println(Thread.currentThread().getName() + " is running");
	}
}