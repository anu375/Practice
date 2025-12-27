package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Second_Highest
{

	public static void main(String[] args) 
	{
		
		Set<Integer> set = new HashSet<>(Arrays.asList(10,50,30,40));
		
		List<Integer> list = new ArrayList<>(set);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(list.size() - 2));

	}

}
