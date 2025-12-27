package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SortList_Without_CollectionsSort
{

	public static void main(String[] args) 
	{
		
		List<Integer>list = new ArrayList<>(Arrays.asList(5,2,8,1));
		
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i) > list.get(j))
				{
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j,  temp);
				}
			}
		}
		System.out.println(list);

	}

}
