package Encapsulation;

public class Login
{

	public static void main(String[] args)
	{
		
		Login_1 login = new Login_1();
		
		System.out.println(login.validate("admin", "1234"));

	}

}

class Login_1
{
	private String Username = "admin";
	private String Password = "1234";
	
	public boolean validate(String username, String password)
	{
		return Username.equals(username)&& Password.equals(password);
	}
}