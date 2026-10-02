package com.iostream;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main 
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c = Class.forName("com.iostream.Student");

		System.out.println(c.getName());
		
		Method[] methods=c.getMethods();
		
		//----------methods in student class---------------
		
		System.out.println("methods in student class");
		int no_of_methods=0;
		
		for(Method m:methods)
		{
			System.out.println(m);
			no_of_methods++;
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println(no_of_methods);
		System.out.println();
		
		System.out.println();
		
		//----------fields in student class---------------
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		
		System.out.println("fields in student class");
		
		Field[] field=c.getDeclaredFields();
		
		for(Field f:field)
		{
			System.out.println(f);
		}
		
	}

}
