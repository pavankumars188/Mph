
package com.mph.empp;

import java.util.Scanner;

import com.mph.empp.Employee;
import com.mph.empp.Salary;
import com.mph.empp.Manager;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeController1 implements EmployeeInterface1 {
	Employee emp;
	Salary sal;
	Manager man;
	public void addEmployee()
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
		//System.out.println(emp.getEid() + " " + emp.getEname());	
	    System.out.println("Employee "  + eno + "Succesfully added");
	}
		public void addExpp()
		{
			man=new Manager();
		  System.out.println("enter experience");
		  Scanner  pc = new Scanner(System.in);
		int exx=pc.nextInt();
		  man.setExp(exx);
		  System.out.println("Employee Experience "  + exx );
		}
		
		
	
	
		
	public void viewEmployee()
	{
		System.out.println(emp);	
	}
	@Override
	public void sortEmp() {
		// TODO Auto-generated method stub
		
	}
	
	
}