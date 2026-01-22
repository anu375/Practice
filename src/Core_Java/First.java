package Core_Java;


/**
 * Reverse String (without stringBuilder)
 */

public class First 
{

	public static void main(String[] args)
	{
		String str = "Java";
		char[] ch = str.toCharArray();
		
		for(int i = ch.length - 1; i >= 0; i--)
		{
			System.out.println(ch[i]);
		}
	}
	
}
