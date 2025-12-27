package Collection;

import java.util.Arrays;
import java.util.List;

public class Reverse_List
{

	public static void main(String[] args) 
	{
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		for(int i = list.size()-1; i >= 0; i--)
		{
			System.out.println(list.get(i)+" ");
		}

	}

}
