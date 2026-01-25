package Practice;

import java.util.Arrays;

public class Test_1 
{

	public static void main(String[] args)
	{
		int max = Arrays.asList(90, 10, 20, 30, 40)
				.stream()
				.max(Integer :: compare)
				.get();
		
		System.out.println(max);
	}
	
}
