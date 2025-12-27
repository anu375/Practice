package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Second 
{

	public static void main(String[] args) 
	{
		 List<Integer> list = Arrays.asList(10,10,20,30,40,40,0,0,0);
		 Set<Integer>set = new HashSet<>();
		 Set<Integer>duplicate = new HashSet<>();
		 
		 for(int i : list)
		 {
			 if(!set.add(i))
			 {
				 duplicate.add(i);
			 }
		 }
		 System.out.println(duplicate);
	}

}
