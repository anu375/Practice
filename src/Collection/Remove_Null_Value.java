package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Remove_Null_Value 
{

	public static void main(String[] args) 
	{
		
		List<String> list = new ArrayList<>(Arrays.asList("A",null,"B",null,"C"));
		
		list.removeIf(e -> e == null);
		System.out.println(list);

	}

}
