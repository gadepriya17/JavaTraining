package com.yash.javatraning.homepractise.ExceptionQ3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemoWithFinally 
{
  public static void main(String[] args)throws IOException
  {
	 System.out.println("Enter the Name: ");
	 BufferedReader br =new BufferedReader(new InputStreamReader((System.in)));
	 try
	 {
		String str = br.readLine();
		System.out.println(str);
		throw new Exception();
	 } 
	 catch (Exception e)
	 {
		System.out.println(e); 
	 }
	 finally
	 {
		 br.close();
		 System.out.println("BufferReader object closed");
	 }
  }
}
