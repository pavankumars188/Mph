package com.mph.extraa;

public class JavaBlocks {

	static int num1;
	int num2;
	
	JavaBlocks()
	{
		System.out.println("From Java  Blocks const...");
		
	}
	// Static block
	static {
		System.out.println("Static Block 2");
		num1 = 401;
		System.out.println(num1 + " from static block 2");
	}
	// Static block
	static {
		System.out.println("Static Block 1");
		num1 = 400;
		System.out.println(num1 + " from static block 1");
	}

	// Non static block
	{
		System.out.println("Non - Static Block 1");
		num2 = 500;
		System.out.println(num2 + " from non-static block 1");
	}

	// Non static block
	{
		System.out.println("Non - Static Block 2");
		num2 = 501;
		System.out.println(num2 + " from non-static block 2");
	}

	public static void staticDisplay() {
		System.out.println("From static display...");
	}

	public void display() {
		System.out.println("From display...");
	}

	public static void main(String[] args) {
		JavaBlocks jb1 = new JavaBlocks();
		JavaBlocks jb2 = new JavaBlocks();

	}

}