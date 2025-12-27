package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Missing_No 
{

	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(11,2,4,5,7,9,0);
		
		int min = Collections.min(list);
		int max = Collections.max(list);

		for(int i = min; i <= max; i++)
		{
		    if(!list.contains(i))
		    {
		        System.out.println("Missing No : " + i);
		    }
		}
		
//		int n = 5;
//		
//		for(int i = 1; i <= n; i++)
//		{
//		    if(!list.contains(i))
//		    {
//		        System.out.println(i);
//		        break;
//		    }
//		}

		
//		int n=5;
//		int sum = n*(n+1)/2;
//		int actual = 0;
//		
//		for(int i : list)
//		{
//			actual += i;
//		}
//		
//		System.out.println(sum - actual);

	}

}
