package com.iostream;

import java.io.FileInputStream;

public class Exception {

	public static void main(String[] args) 
	{
		/*
		  this is checked exception 
		bcause compiler know that user will provide a path and may be this file exists or crash

		 */
		//FileInputStream fis=new FileInputStream("d:/aaa.txt"); 
		
		/*
		 this is unchecked exception because compiler has no idea about user input
		 */
		System.out.println(100/0);
		
	}

}
