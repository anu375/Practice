package Encapsulation;

public class Train_Ticket
{

	public static void main(String[] args) 
	{
		
		Ticket ticket = new Ticket();
		ticket.bookSeat();
		System.out.println("Remaining : "+ticket.availableSeats());

	}

}

class Ticket
{
	private int seats = 5;
	
	public void bookSeat()
	{
		if(seats > 0)
		{
			seats--;
			System.out.println("Seat Booked..");
		}
		else
		{
			System.out.println("No Seats Available..");
		}
	}
	
	public int availableSeats()
	{
		return seats;
	}
}