package com.iostream;

public class StringBufferCode {

	public static void main(String[] args)
	{
		
		
		//============Check palindrome===============
		
		/*
		String s1="madam";
		
		StringBuffer sb=new StringBuffer(s1);
		
		String s2=sb.reverse().toString();
		
		if(s1.equals(s2))
		{
			System.out.println("Plaindrome");
			
		}
		else
		{
			System.out.println("Not Plaindrome");
		}
		*/
		
		//===============library function===============
		
		StringBuffer sb1=new StringBuffer("Afrin");
		
		sb1.append("Binte Amin");
		
		System.out.println(sb1);
		
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		
		
	}

}
