package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class Check_IF_TwoListAre_Equal
{

	public static void main(String[] args) 
	{
	
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(3,2,1);
		
		//System.out.println(list1.equals(list2));
		/**
		 * if i take a list1 = [1,2,3] 
		 * & list2 = [1,2,3] in this case list1.equals(list2) 
		 * give output TRUE.
		 * Order Matter.
		 */
		System.out.println(new HashSet<>(list1).equals(new HashSet<>(list2)));

	}

}
