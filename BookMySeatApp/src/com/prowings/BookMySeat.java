package com.prowings;

public class BookMySeat {

	public static void main(String[] args)
	{
		Theater theater = new Theater();
		
		TheaterOne thOne = new TheaterOne(theater, 4);
		thOne.setName("Vijal");
		thOne.start();
		
		TheaterTwo thTwo = new TheaterTwo(theater, 7);
		thTwo.setName("Snehal");
		thTwo.start();
		
//		TheaterTwo thTwo1 = new TheaterTwo(theater, 6);
//		thTwo1.setName("Snehal");
//		thTwo1.start();
	}
}
