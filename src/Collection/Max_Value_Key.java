package Collection;

import java.util.Map;
import java.util.HashMap;

public class Max_Value_Key
{

	public static void main(String[] args)
	{
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 10);
		map.put("B", 50);
		map.put("C", 30);
		
		String maxKey = null;
		int max = Integer.MIN_VALUE;
		
		for(Map.Entry < String, Integer> e : map.entrySet())
		{
			if(e.getValue() > max)
			{
				max = e.getValue();
				maxKey = e.getKey();
			}
		}
		
		System.out.println(maxKey);

	}

}
