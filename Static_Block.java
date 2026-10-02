package com.iostream;

public class Static_Block
{
	static
	{
		System.out.println("Static Block 1 executed");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method executed");
	}
	
	static
	{
		System.out.println("Static Block 2 executed");
	}


}
