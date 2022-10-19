package com.yash.javatraning.homepractise.ExceptionQ1;

import java.util.Scanner;

public class StudentResult 
{
	private int mark1;
	private int mark2;
	private int mark3;

	Scanner scanner = new Scanner(System.in);

	public void getavg() throws ResultException {
		System.out.println("enter maths mark: ");
		mark1 = scanner.nextInt();
		System.out.println("enter Science mark: ");
		mark2 = scanner.nextInt();
		System.out.println("enter History mark: ");
		mark3 = scanner.nextInt();

		int avg = (mark1 + mark2 + mark3) / 3;

		if ((mark1 <= 40 && mark1 < 0) || (mark2 <= 40 && mark2 < 0) || (mark3 <= 40 && mark3 < 0) || avg <= 40) {
			Student.Display();
			throw new ResultException("Sorry!!!You are failed");
			
		} 
	/*	else if((mark1 <= 0) && ((mark1 <= 0) && ((mark3 <= 0))
		{
			Student.Display();
			throw new NegativeMarkException("Please enter Positve Mark");
		}*/
		else {
			Student.Display();
			System.out.println("Congratulation!!!! you are passed.");

		}

	}

}
