package com.iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteOnFile {

	public static void main(String[] args)
	{
		try
		{
			Writer w=new FileWriter("D:\\Java problem\\serializable\\aaa.txt");
			String txt="This is my new File";
			
			w.write(txt);
			w.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
