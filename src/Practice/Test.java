package Practice;

import java.util.Arrays;

public class Test 
{

	public static void main(String[] args)
	{
		
		int sum = Arrays.asList(1,2,3,4,5)
				.stream()
				.mapToInt(Integer :: intValue)
				.sum();
		
		System.out.println(sum);
		
	}
	
}
