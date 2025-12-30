package Encapsulation;

public class Email
{

	public static void main(String[] args) 
	{
		
		EmailAccount email = new EmailAccount();
		
		System.out.println(email.login("mail@123"));

	}

}

class EmailAccount
{
	private String password = "mail@123";
	
	public boolean login(String pass)
	{
		return password.equals(pass);
	}
}