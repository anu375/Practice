package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicate
{

	public static void main(String[] args)
	{
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5,6,8,9,5,1,2,2,3,4,4));
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
		Collections.sort(list, (a,b) -> a-b);
		System.out.println(list);
		
	}
	
}
