package com.iostream;

public class UsingToStringANDParseFunction {

	public static void main(String[] args) 
	{
		
		//============String to Primitive===========
		
		
		String s1="32";
		
		double d=Double.parseDouble(s1);
		System.out.println("D :"+d);
		
		
		//=============Primitive to String===============
		
		float f=89.76f;
		
		String s2=Float.toString(f);
		System.out.println("S2 :"+s2);
		

	}

}
