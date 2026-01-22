package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO
{

	public void addStudent(Student s)
	{
		try
		{
			Connection con = DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("insert into student_1 values(?,?,?,?)");
			
			ps.setInt(1, s.id);
			ps.setString(2,s.name);
			ps.setString(3, s.email);
			ps.setInt(4, s.marks);
			
			ps.executeUpdate();
			
			System.out.println("Student Added Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void viewStudents()
	{
		try
		{
			Connection con = DBConnection.getConnection();
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from student_1");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateMarks(int id, int marks)
	{
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update student_1 set marks = ? where id = ?");
			
			ps.setInt(1, marks);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			System.out.println("Marks Update");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id)
	{
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
			
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Student Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
