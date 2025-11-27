package Practice;

import java.util.Scanner;

public class EvenNo_Sum {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter no : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i+=2) {
			System.out.println("Even Number : "+i);
			sum = sum +i;
		}
		System.out.println("Sum of the even number : "+sum);
	}
}
