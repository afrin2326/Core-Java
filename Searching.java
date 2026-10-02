package com.iostream;

public class Searching {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		int element=30;
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.print("element is found at "+i+" index position");
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.print("element not found");
		}

	}

}
