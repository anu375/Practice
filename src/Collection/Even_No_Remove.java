package Collection;

import java.util.Arrays;
import java.util.List;

public class Even_No_Remove
{

	public static void main(String[] args) 
	{
		
		List<Integer>list = Arrays.asList(10,2,50,60,11,13,7,5,15,12);
		
		
		for(int i : list)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}
