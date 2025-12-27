package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MoveAll_ZerosTo_End
{

	public static void main(String[] args) 
	{
		
		List<Integer> list = new ArrayList<>(Arrays.asList(0,1,0,3,0,12));
		
		int index = 0;
		
		for(int i : list)
		{
			if(i != 0)
			{
				list.set(index++, i);
			}
		}
		
		while(index < list.size())
		{
			list.set(index++, 0);
		}
		
		System.out.println(list);

	}

}
