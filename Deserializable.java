package com.iostream.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.iostream.entities.Student;

public class Deserializable {

	public static void main(String[] args) 
	{
		Student st=new Student("Afrin", 01);
		
		try(
				FileInputStream fis=new FileInputStream("D:\\\\Java problem\\\\serializable\\\\student.se");
				ObjectInputStream ois=new ObjectInputStream(fis);
				
				)
		{
			Student std=(Student)ois.readObject();
			
			System.out.println("Name : "+std.getName());
			System.out.println("Name : "+std.getId());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
