package JDBC;

import java.util.Scanner;

public class MainApp 
{

	public static void main(String[] args)
	{
		StudentDAO dao = new StudentDAO();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Enter id name email marks");
			
			dao.addStudent(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
			
			break;
			
			case 2 : dao.viewStudents();
			break;
			
			case 3 : System.out.println("Enter id & new marks");
			
			dao.updateMarks(sc.nextInt(),sc.nextInt());
			break;
			
			case 4 : System.out.println("Enter id : ");
			
			dao.deleteStudent(sc.nextInt());
			break;
			
			case 5 : System.exit(0);
			}
		}
	}
	
}
