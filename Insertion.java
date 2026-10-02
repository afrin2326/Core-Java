package com.iostream;

public class Insertion 
{
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		int element=120;
		int indx_pos=2;
		
		int[] new_arr=new int[arr.length+1];
		
		for(int i=0;i<new_arr.length;i++)
		{
			if(i < indx_pos)
			{
				new_arr[i]=arr[i];
			}
			else if(i == indx_pos)
			{
				new_arr[i]= element;
				
			}
			else
			{
				new_arr[i]=arr[i-1];
			}
			
		}
		
		for(int no:new_arr)
		{
			System.out.print(no+" ");
		}
		
		
		
		
	}

}
