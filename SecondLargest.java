package com.iostream;

public class SecondLargest {

	public static void main(String[] args) 
	{
		int[] arr= {4,7,0,2,5,1,8,11,9,10};
		
		
		/*
		for(int i=0;i<arr.length;i++)
		{
			boolean status=true;
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					status=false;
				}
				
			}
			if(i==1)
			{
				break;
			}
		}
		
		System.out.println("Second Largest Element is "+arr[arr.length-2]);
		*/
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1)
			{
				max2=arr[i];
	
			}
		}
		
		System.out.println("Second Largest Element is "+max2);

	}

}
