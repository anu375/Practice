package Practice;

public class IF_ELSE_LADDER
{

	public static void main(String[] args)
	{
		String name = "Shawrya";
		boolean JavaDeveloper = true;
		boolean JavaTrainer = false;
		
		if(name.equals("Anushka"))
		{
			if(JavaDeveloper)
			{
				System.out.println(name + ": is a JavaDeveloper ");
			}
			else if(JavaTrainer)
			{
				System.out.println(name + ": is a JavaTrainer ");
			}
			else
			{
				System.out.println(name + ": is not JavaDeveloper or JavaTrainer");
			}
		}
		else if(name.equals("Shawrya"))
		{
			if(JavaDeveloper)
			{
				System.out.println(name + ": is a JavaDeveloper");
			}
			else if(JavaTrainer)
			{
				System.out.println(name + ": is a JavaTrainer");
			}
			else
			{
				System.out.println(name + ": is not JavaDeveloper or JavaTrainer");
			}
		}
		else
		{
			System.out.println("Unknown Person");
		}
	}
	
}
