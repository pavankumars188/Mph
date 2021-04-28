package com.mph.empp;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import com.mph.excption.UserNotFoundException;
import java.util.Scanner;
import java.util.function.BiPredicate;



public class MainClass1 {
	public static void main(String[] args) throws IOException{
		{
			try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter UserName");
			String un=br.readLine();
			System.out.println("Enter Pasword");
			String pw =br.readLine();
			BiPredicate<String, String> pred=(upp,pwd)->un.equals(pw);
			System.out.println("Loading");
			System.out.println(pred.test("Priya","Priya")); 
			try {
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			if(un.equals(pw))
			{
				System.out.println("Welcome " +  un + "  !!!" );
				
			}
			else
			{
				throw new UserNotFoundException();
				
			}

			
			}
			
			catch(UserNotFoundException unfe)
			{
				System.out.println(unfe);
				
			}		
			catch(Exception e)
			{
				System.out.println("Exception Raised");
				e.printStackTrace();
			}
		}
		 

		EmployeeInterface1 ec = new EmployeeController1();
		List elist =null;
		Scanner sc = new Scanner(System.in);

		String input = null;
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sort");
			System.out.println("4. Sort by A");
			System.out.println("5. serialise");
			System.out.println("6. Deserialise");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				elist =ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee(elist);
				break;
			}
			case 3: {
				ec.sortEmp();
               break;
			}
			case 4: {
				ec.nameStartA(elist);
				break;
			}
			case 5: {
				ec.Serialise();
				System.out.println("Data successfully Serialized...");
				break;
			}
			case 6: {
				ec.Deserial();
				break;
			}
			
			default: {

			}

			}
			System.out.println("Do you want to continue ? Y or y for yes");
			input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
	}
}
