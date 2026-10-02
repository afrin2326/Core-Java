package com.iostream;

public class MoveZeroEnd {

	public static void main(String[] args) 
	{
		int[] arr= {1,0,0,1,1,0,1,0,1,0,0};
		int count=0;
		
		/*
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		
		for(int i=0;i<count;i++)
		{
			arr[i]=1;
		}
		
		for(int i=count;i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			while(left<right && arr[left]==1)
			{
				left++;
			}
			
			while(left<right && arr[right]==0)
			{
				right--;
			}
			
			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
				
			}
			
			
		}
		
		for(int no:arr)
		{
			System.out.print(no+" ");
		}
		
		

	}

}
