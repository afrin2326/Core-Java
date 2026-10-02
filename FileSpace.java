package com.iostream;

import java.io.File;

public class FileSpace {

	public static void main(String[] args)
	{
		try
		{
			File f=new File("D:\\");
			System.out.println(f.getFreeSpace()/1024/1024/1024);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
