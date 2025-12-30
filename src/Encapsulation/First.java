package Encapsulation;

public class First
{

	public static void main(String[] args)
	{
		
		Student s = new Student();
		
		s.setId(101);
		s.setName("Anushka");
		
		System.out.println("ID : "+s.getId());
		System.out.println("Name : "+s.getName());
		
	}

}

class Student
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;	
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}