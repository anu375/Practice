package Collection;

import java.util.Arrays;
import java.util.List;

public class Largest_String 
{

	public static void main(String[] args) 
	{
		
		List<String>list = Arrays.asList("Java","HTML","CSS","JS","Python","C++","C","DBMS");
		
		String largest = list.get(0);
		
		for(String s : list)
		{
			if(s.length() > largest.length())
			{
				 largest = s;
			}
		}
		System.out.println(largest);
	}

}
