package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class A {
	int n1,n2,add,sub,mul,div,rem;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}
	void process() {
		add = n1+n2;
		mul = n1*n2;
		div = n1/n2;
		sub = n1-n2;
		rem = n1%n2;
	}
	void output() {
		System.out.println("Sum of Two numbers : "+add);
		System.out.println("Mul of Two numbers : "+mul);
		System.out.println("Div of Two numbers : "+div);
		System.out.println("Sub of Two numbers : "+sub);
		System.out.println("Rem of Two numbers : "+rem);
	}
	public static void main(String[] args) {
		A a = new A();
		a.input();
		a.process();
		a.output();
		
//		String a[] = {"Learn","Coding","Keypoints","Education"};
//		System.out.println("toString() : "+Arrays.toString(a));
//		System.out.println("asList() : "+Arrays.asList(a));
//		
//		int arr[][] = {{10,20},{30,40}};
//		System.out.println("deeptoString()  : "+Arrays.deepToString(arr));
//		//Arrays.deepToString() :- Converts multi-dimensional array into a readable string.
//		
//		int aa[] = {1,2,3};
//		System.out.println(aa);//-->[I@4783da3f (use Arrays.toString() method avoid this type o/p)
	}
}
