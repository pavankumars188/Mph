package com.mph.javaexms;


interface Compute{
	public int add(int a,int b);
	
}
public class LambdaEg{

	public static void main(String[] args) {
		//LambdaEg le = new LambdaEg();
		//System.out.println(le.add(10, 20));
		
		Compute com=(a, b)->{
			return (a+b);	
			};
		System.out.println(com.add(45, 45));
		
	}
	/*@Override
	public int add(int a, int b) {
		
		return (a+b);
	}*/
	
	
		
}