package com.mph.view;

public class MyClass {
	int y=150;
   static int z=200;
   public void display()
   {
	  System.out.println("From display method");
   }
	public static void main(String[] args) {
		int x=100;
		System.out.println("Hello World"+100);
		System.out.println("static var"+z);
		
		MyClass m= new MyClass();
		System.out.println("instance var"+m.y);

	}

}
