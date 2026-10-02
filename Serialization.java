package com.iostream.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.iostream.entities.Student;

public class Serialization
{
	public static void main(String[] args)
	{
		Student st=new Student("Afrin", 01);
		
		try(
				FileOutputStream fis=new FileOutputStream("D:\\Java problem\\serializable\\student.se");
				
				ObjectOutputStream oos=new ObjectOutputStream(fis);
				
				)
		{
			oos.writeObject(st);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
