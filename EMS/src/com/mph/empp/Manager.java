package com.mph.empp;
import com.mph.empp.Employee;
import com.mph.empp.Salary;

public class Manager extends Employee {
	int Exp;

	public Manager() {
		System.out.println("From mngr constr...");
	}

	public int setExp(int exp)
	{
		return this.Exp=exp;
	}
	 
	public int getExp()
	{
		return Exp;
	}

	

	

}
