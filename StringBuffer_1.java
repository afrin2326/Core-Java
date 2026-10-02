package com.iostream;

public class StringBuffer_1 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("afrin");
		System.out.println(sb.append(" Amin"));
		
		String name1="Alhan";
		String name2="Sakeen";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
		
		char c1='K';
		char c2='l';
		
		System.out.println((int)c1);
		
		System.out.println(name1.equals(name2));
		
		
		StringBuffer_1 sb2=new StringBuffer_1();
		StringBuffer_1 sb3=new StringBuffer_1();
		// sb3=sb2;
		
		System.out.println(sb2==sb3);
		
				
		
	

	}

}
