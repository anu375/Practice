package Practice;

import java.util.Scanner;

public class charPrint {

	public static void main(String[] args) {
		char ch;
		System.out.println("Please enter character : ");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println(ch);
	}
}
