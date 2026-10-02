package com.iostream;

public class WrapperClassCode {

	public static void main(String[] args) 
	{
		/*
		 Wrapper classes are used to convert primitive into object and object into primitive
		 
		 ****AUTOBOXING===converting primitive primitive to  object
		 ****UNBOXING=====converting object to primitive
		 
		EXAMPLE
		-------
		
		primitive       |        Wrapper Class
		---------       |        ------------
		boolean         |        Boolean
		char            |        Character
		
		 */
		
		//----------------autoboxing---------------
		
		int x=10;
		
		Integer y=Integer.valueOf(x);
		
		System.out.println(y);
		
		Integer z=x; //compiler automatically do Integer.valueOf function
		System.out.println(y);
		
		
		//-----------------unboxing--------------------
		
		Double d=new Double(10.34);
		
		System.out.println("D :"+d);
		
		double e=d.doubleValue();
		
		System.out.println("E :"+e);
		
		
		
		
		
		

	}

}
