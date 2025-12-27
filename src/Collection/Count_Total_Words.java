package Collection;

import java.util.Map;
import java.util.HashMap;

public class Count_Total_Words 
{

	public static void main(String[] args) 
	{
		
		String str = "Java is Object oriented  java is secure  java is high level";
		
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : arr)
		{
		    if(map.containsKey(word))
		        map.put(word, map.get(word) + 1);
		    else
		        map.put(word, 1);
		}
		System.out.println(map);

		
//		String[] arr = str.split(" ");
//		Map<String, Integer> map = new HashMap<>();
//		
//		for(String word : arr)
//		{
//			map.put(word, map.getOrDefault(word,  0)+1);
//		}
//		
//		System.out.println(map);

	}

}
