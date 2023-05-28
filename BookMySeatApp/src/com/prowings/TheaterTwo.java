package com.prowings;

public class TheaterTwo extends Thread{
	
	Theater theater;
	int seats;
	
	public TheaterTwo(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run() {
		
		theater.bookSeats(seats);
	}
	
	
	

}
