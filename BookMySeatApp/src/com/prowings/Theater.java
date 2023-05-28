package com.prowings;

public class Theater 
{
	
	int totalSeats = 10;
	
	public void bookSeats(int seats) 
	{
		
		if(seats <= totalSeats) 
		{
			System.out.println(Thread.currentThread().getName() +" "+ seats + " seats are booked successfully..." );
			totalSeats = totalSeats - seats;
			System.out.println(Thread.currentThread().getName()+ " Available seats are: "+ totalSeats);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+ " "+ seats + " seats are not available");
			System.out.println(Thread.currentThread().getName()+ " "+ totalSeats + "seats are available");
		}
		
	}

}
