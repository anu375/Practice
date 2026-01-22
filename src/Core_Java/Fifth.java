package Core_Java;

public class Fifth 
{

	public static void main(String[] args)
	{
		int[] arr = {10, 45, 2, 89, 32};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			System.out.println("Largest : "+max);
		}
	}
	
}
