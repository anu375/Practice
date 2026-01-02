package Polymorphism;

public class Main_1_1
{

	public static void main(String[] args) 
	{
		
		Employee e = new Employee();
		
		System.out.println(e.calculateSalary());
		
		e = new Developer();
		
		System.out.println(e.calculateSalary());
		
		e = new Manager();
		
		System.out.println(e.calculateSalary());
		
	}

}

class Employee
{
	double calculateSalary()
	{
		return 30000;
	}
}

class Developer extends Employee
{
	double calculateSalary()
	{
		return 50000;
	}
}

class Manager extends Employee
{
	double calculateSalary()
	{
		return 70000;
	}
}