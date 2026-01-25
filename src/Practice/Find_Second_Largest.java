package Practice;

public class Find_Second_Largest
{

	public static void main(String[] args)
	{
		int[] arr = {10, 45, 2, 99, 98, 99, 23};
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : arr)
		{
			if(num > largest)
			{
				second = largest;
				largest = num;
			}
			else if(num > second && num != largest)
			{
				second = num;
			}
		}
		
		System.out.println(second);
	}
	
}
