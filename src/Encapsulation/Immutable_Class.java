package Encapsulation;

public class Immutable_Class
{

	public static void main(String[] args) 
	{
		
		User user = new User(1,"Anushka");
		System.out.println(user.getId()+" "+user.getName());

	}

}

final class User
{
	private final int id;
	private final String name;
	
	public User(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}