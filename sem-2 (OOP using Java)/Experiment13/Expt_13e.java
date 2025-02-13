// WAP to prevent concurrent booking of a ticket using the concept of thread synchronization.

import java.util.*;

class TicketBooking
{
	Scanner sc=new Scanner(System.in);
	synchronized public void bookTicket()
	{
			int fare;
			
			try
			{
				System.out.println("Enter fare of ticket");
				fare=sc.nextInt();
				System.out.println("Wait your ticket booking is in process");
				for(int i=0;i<4;i++)
				{
					System.out.print("....    ");
					Thread.sleep(500);
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}

			System.out.println("\nYour Ticket has been confirmed Successfully!!");
		
	}
}

class Passenger extends Thread
{
	TicketBooking ticket;

	Passenger(TicketBooking ticket)
	{
		this.ticket = ticket;
	}

	@Override
	public void run()
	{
		ticket.bookTicket();
	}
}

class Expt13_e
{
	public static void main(String args[])
	{
		TicketBooking obj = new TicketBooking();

		Passenger p1 = new Passenger(obj);
		Passenger p2 = new Passenger(obj);

		p1.start();
		p2.start();
	}
}
