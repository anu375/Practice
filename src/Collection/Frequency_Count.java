package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Frequency_Count 
{

	public static void main(String[] args) 
	{
		
		List<String> list = Arrays.asList("A","B","C","A","B","A","D");
		Map<String,Integer>map = new HashMap<>();
		
		for(String s : list)
		{
			map.put(s,  map.getOrDefault(s, 0)+1);
		}
		
		System.out.println(map);
		
	}

}
