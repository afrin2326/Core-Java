package com.iostream;

public class Updation {

	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50};
		int element=120;
		int indx_pos=2;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[indx_pos]=element;
		}
		
		for(int no : arr)
		{
			System.out.print(no+" ");
		}
		

	}

}
