package com.iostream;
class Address
{
	String houseNo="39/A";
	int roadNo=45;
	String block="L";
	String area="Basundhara";
	
	public void display()
	{
		System.out.print(" "+houseNo+" "+roadNo+" "+block+" "+area+" ");
		
	}
}

class Student
{
	String name="Afrin";
	Address addr;
	//new Address().display();
	
	public void display()
	{
		new Address().display();
	}
	
}

public class Has_A_Relationship 
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.display();
	}
	

}
