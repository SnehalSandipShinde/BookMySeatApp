package com.prowings;

public class TheaterOne extends Thread{

	Theater theater;
	int seats;
	
	public TheaterOne(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run() {
		
		theater.bookSeats(seats);
	}
	
	
	
	
}
