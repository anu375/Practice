package Core_Java;

public class Student
{

	int id;
	String name;
	
	Student()
	{
		System.out.println("Non-Parameterized Constructor");
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		new Student();
		new Student(1, " anushka ");
	}
	
}
