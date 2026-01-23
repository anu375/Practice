package Core_Java;

interface Animal 
{
	void sound();
}

class Dog implements Animal
{
	public void sound()
	{
		System.out.println("Bark");
	}
	
	public static void main(String[] args)
	{
		Animal a = new Dog();
		a.sound();
	}
}