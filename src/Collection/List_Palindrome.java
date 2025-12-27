package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class List_Palindrome 
{

	public static void main(String[] args) 
	{
		
		List<Integer> list = Arrays.asList(0,1,2,3,2,1,0);
		
		List<Integer> rev = new ArrayList<>(list);
		Collections.reverse(rev);

		System.out.println(list.equals(rev));
		
//		boolean flag = true;
//		
//		for(int i=0; i<list.size()/2; i++)
//		{
//			if(!list.get(i).equals(list.get(list.size()-1-i)))
//			{
//				flag = false;
//				break;
//			}
//		}
//		
//		System.out.println(flag);

	}

}
