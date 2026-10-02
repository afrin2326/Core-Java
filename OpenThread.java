package com.iostream;

public class OpenThread
{

	public static void main(String[] args) 
	{
		try
		{
			Runtime.getRuntime().exec("mspaint.exe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
