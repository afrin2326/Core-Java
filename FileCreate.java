package com.iostream;

import java.io.File;

public class FileCreate {

	public static void main(String[] args) 
	{
		try
		{
			File f=new File("D:\\Java problem\\serializable\\aaa.txt");
			
			if(f.createNewFile())
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("success");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
