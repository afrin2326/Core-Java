package com.iostream;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		//======Binary,Octal,HexaDecimal to Decimal===========
		
		
		String binary="101100";
		Integer decimal=Integer.parseInt(binary, 2);
		System.out.println("Decimal Number is:"+decimal);
		
		
		String octal="16";
		Integer decimal1=Integer.parseInt(octal, 8);
		System.out.println("Octal Number is:"+decimal1);
		
		String hexaDecimal="78";
		Integer decimal2=Integer.parseInt(hexaDecimal, 16);
		System.out.println("Decimal Number is:"+decimal2);
		
		
		//=============Decimal to Binary,Octal,HexaDecimal===============
		
		int decimal5=15;
		String hexaDecimal7 =Integer.toHexString(decimal5);
		System.out.println("Hexa-Decimal Number is:"+hexaDecimal7);
		

	}

}
