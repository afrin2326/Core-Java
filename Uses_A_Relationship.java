package com.iostream;

class Whiteboard
{
	public void writeOnBoard()
	{
		System.out.println("writting on board");
	}
}

class Teacher
{
	public void teachOnBoard()
	{
		Whiteboard bd=new Whiteboard();
		bd.writeOnBoard();
		
		System.out.println("Teaching java on board");
	}
}

public class Uses_A_Relationship {

	public static void main(String[] args)
	{
		
		Teacher t=new Teacher();
		t.teachOnBoard();

	}

}
