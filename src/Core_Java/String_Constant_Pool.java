package Core_Java;

public class String_Constant_Pool
{

	public static void main(String[] args)
	{
		String a = "Java";
		String b = "Java";
		/**
		 * String b1 = "java";
		 * System.out.println(a == b1);
		 * output get FALSE
		 */
		String c = new String("Java");
		
		System.out.println(a == b);   //True
		System.out.println(a == c);   //False
	}
	
}
