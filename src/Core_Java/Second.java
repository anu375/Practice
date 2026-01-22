package Core_Java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Reverse String using java 8 Streams
 */
public class Second
{

	public static void main(String[] args)
	{
		String str = "Java";
		
		String reverse = IntStream.range(0, str.length())
				.mapToObj(i->str.charAt(str.length()-i-1))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println(reverse);
				
	}
	
}
