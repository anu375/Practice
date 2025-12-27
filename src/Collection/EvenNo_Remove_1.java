package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class EvenNo_Remove_1 
{

	public static void main(String[] args) 
	{
		
		List<Integer> list = new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			if(it.next() % 2 == 0)
			{
				it.remove();
			}
		}
		
		System.out.println(list);
	}

}
