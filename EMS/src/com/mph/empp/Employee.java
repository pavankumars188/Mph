package com.mph.empp;
import java.util.Arrays;
import java.util.Comparator;

import com.mph.javaexms.Student;

public class Employee implements Comparable<Employee> {
	private int eid;
	private String ename;
	private Salary salary;

	public Employee() {
		System.out.println("From Emp constr...");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}	

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			
			return (s1.getEname().compareTo(s2.getEname()));
		}

};
     public int compareTo(Employee o) {
      return 0;
 }

}



