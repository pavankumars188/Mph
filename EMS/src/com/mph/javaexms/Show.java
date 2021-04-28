package com.mph.javaexms;

interface showw{
	public String display(String s);

}
public class Show{
	public static void main(String[] args) {
		showw dis=(s)->{ 
			
			return s; };
	
	   dis.display("good morning");
}
}