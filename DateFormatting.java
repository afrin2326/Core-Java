package com.iostream;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) 
	{
		Date date=new Date ();
		System.out.println(date);
		
		DateFormat dateFormat=new SimpleDateFormat("dd/mm/yy");
		String currentDate=dateFormat.format(date);
		System.out.println(currentDate);
		
		

		

	}

}
