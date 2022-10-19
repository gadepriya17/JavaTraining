package com.yash.javatraning.homepractise.ExceptionQ10;

public class Parent 
{
	public void calculatemaximum() {

		System.out.println("Parent class call..");
		try {
			int myArray[] = null;
			System.out.println(myArray[5]);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			int arr[] = { 1, 3, 5, 2, 4 };
			int max = arr[0];
			for (int i = 0; i <= arr.length; i++) {
				if (arr[i] > max)
					max = arr[i];
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
			ex.printStackTrace();

		}

		// System.out.println("Largest element present in given array: " + max);
	}

}
