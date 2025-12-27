package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sort_Using_CollectionsSort
{

	public static void main(String[] args) 
	{
		
		List<Integer>list = new ArrayList<>(Arrays.asList(1,2,5,9,0,3,6,7));
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
