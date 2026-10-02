package com.iostream;

public class CountWord {

	public static void main(String[] args) 
	{
		String str="This is my first demo";
		
		int count=0;
		boolean status=false;
		
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAt(i);
			if(c1!=' ')
			{
				if(status==false)
				{
					count++;
					status=true;
				}
			}
			else
			{
				status=false;
			}
		}
		
		System.out.println(count);
		
		

	}

}
