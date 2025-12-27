package Collection;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Sort_HashMap_Key 
{

	public static void main(String[] args) 
	{
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(3, "B");
		map.put(1, "A");
		map.put(2, "C");
		
		//System.out.println(map);
		TreeMap<Integer, String> treeMap = new TreeMap<>(map);
		System.out.println(treeMap);
		
	}

}
