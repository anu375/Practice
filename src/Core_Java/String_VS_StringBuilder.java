package Core_Java;

public class String_VS_StringBuilder 
{

	public static void main(String[] args)
	{
		String str = "Java";
		str.concat("World");
		System.out.println("String : "+str);
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append("World");
		System.out.println("StringBuilder : "+sb);
	}
	
}
