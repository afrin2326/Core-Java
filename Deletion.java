package com.iostream;

public class Deletion {

	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50};
		int element=120;
		int indx_pos=2;
		
		
		
		for(int i=indx_pos ;i<arr.length;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		
		
		for(int no:arr)
		{
			System.out.print(no+" ");
		}
		
		
	}

}
