package com.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputStream {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("F:\\ChatGPT Image Nov 2, 2025, 01_52_12 PM.png");
			FileOutputStream fos=new FileOutputStream("D:\\Java problem\\serializable\\aaa.png");
			
			int i;
			while((i=fis.read())!=0)
			{
				fos.write(i);
			}
			System.out.println("success");
			
			fis.close();
			fos.close();
					
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
