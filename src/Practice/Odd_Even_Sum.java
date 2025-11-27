package Practice;

import java.util.Scanner;

public class Odd_Even_Sum {
	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter No : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0) {
			for(int i=0;i<n;i+=2) {
				sum=sum+i;
			}
			System.out.println("Sum of even numbers : "+sum);
		}
		/**o/p :-
		 * Enter No : 
			10
			Sum of even numbers : 20
			*/
		else
		{
			for(int i=1;i<n;i+=2) {
				sum=sum+i;
			}
			System.out.println("Sum of odd numbers : "+sum);
		}
		/**
		 * Enter No : 
			11
			Sum of odd numbers : 25
		 */
	}
}
