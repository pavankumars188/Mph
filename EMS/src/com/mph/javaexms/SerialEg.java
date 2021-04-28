package com.mph.javaexms;
import com.mph.javaexms.Student;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialEg {

	public static void main(String[] args) {
		Student s = new Student();
		s.setSid(102);
		s.setSname("Deepikkaa");
		s.setAge(12);
		s.setMarks(90);
		FileOutputStream fos =null ;
		ObjectOutputStream oos =null;
		try {
			fos= new FileOutputStream("myfile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			
			System.out.println("Data successfully Serialized...");
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}