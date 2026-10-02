package com.iostream;

class Student
{
	String name;
	int rollno;
	static String school="ABC International School";
	
	
	Student(String n,int r)
	{
		this.name=n;
		rollno=r;
		
		
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollno);
		System.out.println("School : "+school);
		System.out.println("----------------");
	}
}

public class StaticKeyword_Variable2 
{
	
	public static void main(String[] args)
	{
		Student std1=new Student("Afrin",101);
		Student std2=new Student("Arin",102);
		Student std3=new Student("Suskeen",109);
		
		std1.display();
		std2.display();
		std3.display();
		
		
		
	}

}
