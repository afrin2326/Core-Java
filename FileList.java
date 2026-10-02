package com.iostream;

import java.io.File;

public class FileList {

	public static void main(String[] args) 
	{
		try
		{
			File f=new File("D:\\");
			
			String[] fileList=f.list();
			for(String file: fileList)
			{
				System.out.println(file);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
