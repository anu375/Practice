package Multithreading;

public class Main 
{

	public static void main(String[] args)
	{
		
		SignIn signin = new SignIn();
		
		UserThread t1 = new UserThread(signin, "admin","123");
		UserThread t2 = new UserThread(signin, "user","000");
		UserThread t3 = new UserThread(signin,"admin","wrong");
		
		t1.setName("User-1");
		t2.setName("User-2");
		t3.setName("User-3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class SignIn
{
	private boolean isBusy = false;
	
	synchronized void login(String user, String pass)
	{
		while(isBusy)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();	
			}
		}
		
		isBusy = true;
		
		System.out.println(Thread.currentThread().getName()+" is logging in...");
		
		if(user.equals("admin") && pass.equals("123"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		System.out.println(Thread.currentThread().getName()+" finished login\n");
		
		isBusy = false;
		
		notifyAll();
	}
}

class UserThread extends Thread
{
	SignIn signin;
	String user, pass;
	
	UserThread(SignIn signin, String user, String pass)
	{
		this.signin = signin;
		this.user = user;
		this.pass = pass;
	}
	
	public void run()
	{
		signin.login(user,  pass);
	}
}