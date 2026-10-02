package com.iostream;

import java.io.FileReader;
import java.io.Reader;

public class ReadOnFile {

	public static void main(String[] args) 
	{
		
		try
		{
			Reader r=new FileReader("D:\\Java problem\\serializable\\aaa.txt");
			
			int i;
			while((i=r.read())!= -1)
			{
				System.out.print((char)i);
			}
			
			r.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
