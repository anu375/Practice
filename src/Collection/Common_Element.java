package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Common_Element
{

	public static void main(String[] args)
	{
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(3,4,5,6);
		
		List<Integer> common = new ArrayList<>();
		
		for(int i : l1)
		{
			if(l2.contains(i))
			{
				common.add(i);
			}
		}
		
		System.out.println(common);

	}

}
