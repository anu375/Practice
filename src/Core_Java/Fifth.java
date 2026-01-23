package Core_Java;

import java.util.Arrays;
import java.util.Collections;

/**
 * find largest number in array
 */

public class Fifth 
{

	public static void main(String[] args)
	{
		
		Integer[] arr = {10, 45, 2, 99, 23,99};

		int max = Collections.max(Arrays.asList(arr));

		System.out.println("Largest number: " + max);

		
//		int[] arr = {10, 45, 2, 99, 23,101};
//
//		int max = Arrays.stream(arr).max().getAsInt();
//
//		System.out.println("Largest number: " + max);

		
	}
	
}
