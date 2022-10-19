package com.yash.javatraning.homepractise.ExceptionQ10;

public class Child extends Parent 
{

	@Override
	public void calculatemaximum() throws NullPointerException, ArrayIndexOutOfBoundsException {

		System.out.println("child class call");

		// Try block to check if any exception occurs
		try {

			// using the parseInt() method
			int number;

			number = Integer.parseInt(null);

		}

		// Catch block to handle NumberFormatException
		catch (NumberFormatException e) {

			// Print the message if exception occurred
			System.out.println("NumberFormatException occurred");
			e.printStackTrace();
		}
	}

