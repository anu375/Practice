package Core_Java;

import java.util.HashMap;


/**
 * Find Duplicate  Character in String
 */
public class Third 
{

	public static void main(String[] args)
	{
		String str = "Programming";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			map.put(c, map.getOrDefault(c,  0)+1);
		}
		
		map.forEach((k, v) ->{
			if(v > 1)
				System.out.println(k+ " = " +v);
		});
	}
	
}
