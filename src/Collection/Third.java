package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Third
{

	public static void main(String[] args) 
	{
		
		List<Integer>list = Arrays.asList(1,1,2,3,4,4,5,0);
		
		for(int i : list)
		{
			if(Collections.frequency(list,  i) == 1) //Returns how many times "i" appears in list.
				// ==1  :=> Checks whether the element appears only once.if YES Unique element.
			{
				System.out.println(i+ " ");
			}
		}

	}

}
