package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class Maintain_Order 
{

	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(1,2,2,3,1,4);
		Set<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println(set);
		
	}

}
