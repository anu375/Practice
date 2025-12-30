package Encapsulation;

public class Patient_Demo
{

	public static void main(String[] args) 
	{
		
		Patient patient = new Patient();
//		patient.setReport("well");
		System.out.println(patient.getReport());

	}

}

class Patient
{
	private String report;
	
	public void setReport(String report)
	{
		this.report = report;
	}
	
	public String getReport()
	{
		return "Access Granted";
	}
}