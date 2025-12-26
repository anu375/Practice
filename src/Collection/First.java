package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class First
{

	public static void main(String[] args) 
	{
		//remove duplicates.
		
//		List<Integer>list = Arrays.asList(10,20,10,30,20,40);
//		
//		list.stream().distinct().forEach(System.out::println);
		
		
		List<Integer>list1 = Arrays.asList(10,20,10,30,20,40);
		
		Set<Integer>set = new LinkedHashSet<>(list1);
		
		System.out.println(set);
	}

}
