package com.yash.javatraning.homepractise.ExceptionQ3;

import java.io.FileOutputStream;

public class Test
{

	public static void main(String[] args) 
	{
		
       try(FileOutputStream fos = new FileOutputStream("C:\\Users\\priya.gade\\Desktop\\java fullstack traing\\records") ) 
       
       {
		String text ="hello";
		byte arr[] =text.getBytes();
		fos.write(arr);
	   }
       catch (Exception e)
       {
		System.out.println(e);
	   }
       System.out.println("resouece closed  nd msg printed on myfile.txt ");
	}
      
}
