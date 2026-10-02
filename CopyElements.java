package com.iostream;

public class CopyElements {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		
		
		int[] new_arr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			new_arr[i]=arr[i];
			
		}
		
		for(int no : new_arr)
		{
			System.out.print(no+" ");
		}
		
	}

}
