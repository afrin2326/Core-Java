package com.iostream;
abstract class Vehicle
{
	void engineStart()
	{
		System.out.println("Engine started");
	}
	
	abstract void start();
}

class Bus extends Vehicle
{
	void start()
	{
		System.out.println("Bus start with key");
	}
	
}

class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("Scooter start with kick");
	}
	
	
}

class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike start with kick");
	}
	
	
}
public class Abstraction2 {

	public static void main(String[] args) 
	{
		
		
		Vehicle v2=new Bike();
		
		v2.engineStart();
		System.out.println("--------------");
		
		v2.start();
		System.out.println("--------------");
		
		Vehicle v3=new Bus();
		v3.start();
		System.out.println("--------------");
		
		Vehicle v4=new Scooter();
		v4.start();
		

	}

}
