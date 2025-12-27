package Collection;

import java.util.Arrays;
import java.util.List;

public class Fourth
{

	public static void main(String[] args)
	{
		
		List<Integer>list = Arrays.asList(10,50,20,5,30);
		
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i : list)
		{
			if(i > max)
				max = i;
			
			if(i < min)
				min = i;
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
