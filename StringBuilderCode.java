package com.iostream;

public class StringBuilderCode {

	public static void main(String[] args) 
	{
		StringBuilder sbl=new StringBuilder("Afrin");

		sbl.append(" Binte Amin");
		sbl.append(32);
		
		System.out.println(sbl);
		
		sbl.delete(0, 4);
		System.out.println(sbl);
		
	}

}
