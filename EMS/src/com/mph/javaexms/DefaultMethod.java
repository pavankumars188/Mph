package com.mph.javaexms;

interface Phone
{
	public void display();
	public default void show() {
		System.out.println("Showing");
	}

}
class Samsung implements Phone{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Lava implements Phone
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

class Nokia implements Phone
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefaultMethod implements Phone{

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.display();
		dm.show();
	}

	@Override
	public void display() {
		System.out.println("Displaying");
		
	}

	

}

