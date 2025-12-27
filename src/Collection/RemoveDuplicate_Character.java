package Collection;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicate_Character
{

	public static void main(String[] args)
	{
		
		String str = "Programming";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toCharArray())
		{
			set.add(c);
		}
		
		for(char c : set)
		{
			System.out.println(c);
		}

	}

}
