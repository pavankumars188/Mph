package com.mph.empp;
import java.util.Iterator;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.mph.empp.EmployeeInterface1;
import com.mph.empp.Employee;
import com.mph.empp.Salary;
import com.mph.javaexms.Student;

public class EmployeeController1 implements EmployeeInterface1, Serializable {
	Employee emp;
	Salary sal;
	List<Employee> emplist = new ArrayList<Employee>();
	public List addEmployee()
	{
		emp = new Employee();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		emp.setEname(enam);
		
		sal= new Salary();
		
		System.out.println("Enter basic Salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		System.out.println("Enter DA");
		int da = sc.nextInt();
		sal.setDa(da);
		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		sal.setHra(hra);
		System.out.println("Enter PF");
		int pf= sc.nextInt();
		sal.setPf(pf);
		
		sal.setGross(basic, da, hra);
		sal.setNet(sal.getGross(),pf);
		emp.setSalary(sal);
		
		emplist.add(emp);
		
		//System.out.println(emp.getEid() + " " + emp.getEname());	
		System.out.println("Employee "  + eno + "Succesfully added");
		return emplist;
	}
	
	public void viewEmployee(List elist)
	{
		/*Iterator i= elist.iterator();//

		while(i.hasNext())
		{
			System.out.println(i.next());}*/
		elist.forEach(lis ->System.out.println(lis));
		
	}
	
	
	public void sortEmp()
	{
		Collections.sort(emplist,Employee.nameComparator);
		emplist.forEach(lis ->System.out.println(lis));
		
	}
	public void nameStartA(List elist) {
		Predicate<Employee> p2 = emp2 -> (emp2.getEname().startsWith("A") || emp2.getEname().startsWith("a"));
		elist.stream().filter(p2).sorted(Comparator.comparing(Employee::getEname)).forEach(System.out::println);
	}

	public void viewNames(List elist) {
		System.out.println(elist);
	}
	
	
	public void Serialise(List<Employee> elist)
	{
		FileOutputStream fos =null ;
	    ObjectOutputStream oos =null;
	    try {
			fos= new FileOutputStream("myfile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emplist);
			
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
	    public void Deserial()
		// TODO Auto-generated method stub
		{
			Employee eg=emp;
			try (FileInputStream fis = new FileInputStream("myfile.txt");
					ObjectInputStream ois = new ObjectInputStream(fis))
					{
							eg=(Employee)ois.readObject();
							fis.close();
							ois.close();
					}
					catch (ClassNotFoundException | IOException e)
					{
							
							e.printStackTrace();
						}
						
						System.out.println(eg.getEid());
						System.out.println(eg.getEname());
						System.out.println(eg.getSalary());
					
					
				}

		

		@Override
		public void Serialise() {
			// TODO Auto-generated method stub
			
		}

		
					

	
		
	}
	

