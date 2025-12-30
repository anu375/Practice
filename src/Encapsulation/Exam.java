package Encapsulation;

public class Exam
{

	public static void main(String[] args)
	{
		
		ExamDemo exam = new ExamDemo();
		exam.submitAnswer(true);
		System.out.println("Score : "+exam.getScore());

	}

}

class ExamDemo
{
	private int score = 0;
	
	public void submitAnswer(boolean correct)
	{
		if(correct)
			score += 5;
	}
	
	public int getScore()
	{
		return score;
	}
}