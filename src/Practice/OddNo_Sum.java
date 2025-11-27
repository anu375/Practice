package Practice;

import java.util.Scanner;

public class OddNo_Sum {

	public static void main(String[] args) {
	int n,sum=0;
	System.out.println("Enter No : ");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<n;i+=2) {
		System.out.println("Odd Number : "+i);
		sum = sum+i;
	}
	System.out.println("Sum of the odd numbers : "+sum);
	}
}
