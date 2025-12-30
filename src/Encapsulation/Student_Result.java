package Encapsulation;

public class Student_Result 
{

	public static void main(String[] args)
	{
		
		Result result = new Result();
		result.setMarks(85);
		System.out.println("Marks : "+result.getMarks());

	}

}

class Result
{
	private int marks;
	
	public void setMarks(int marks)
	{
		if(marks >= 0 && marks <= 100)
		{
			this.marks = marks;
		}
	}
		
	public int getMarks()
	{
		return marks;
	}
	
}