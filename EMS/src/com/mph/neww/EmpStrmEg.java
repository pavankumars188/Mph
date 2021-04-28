package com.mph.neww;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpStrmEg {

	public static void main(String[] args) {
		Employee[] empArr = {
			new Employee("Sharuk","Khan","IT",90000),
			new Employee("Amir","Khan","HR",80000),
			new Employee("Amitab","Bhachan","Markting",85000),
			new Employee("Hritik","Roshan","Finance",50000),
			new Employee("Thala","Ajith","IT",95000)				
		};
	
		List<Employee> empList = Arrays.asList(empArr);
		System.out.println(empList);
		
		boolean result =empList.stream().anyMatch(emp->emp.getDept().matches("Sales"));
		if(result)
		{
			System.out.println("Employees Available");
		}
		else
		{
			System.out.println("Not Available");
		}
		
		
		
		Predicate<Employee> p1 =emp1 -> (emp1.getSalary()>50000 && emp1.getSalary()<95000);
		empList.stream().filter(p1)
		.sorted(Comparator.comparing(Employee::getFname))
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		empList.stream().filter(p1).forEach(System.out::println);
		System.out.println("-----------------------------------");
		System.out.println(empList.stream().filter(p1).findFirst().get());
		System.out.println("---------------*****--------------------");
		
		Function<Employee, String> byFname = Employee::getFname;
		Function<Employee, String> byLname = Employee::getLname;
		/*
		 * public String fun(Empl)
		 * {
		 * 		return empl.getFname();
		 * }
		 * 
		 * */
		
		
		Comparator<Employee> byLastAndThenFirst = Comparator.comparing(byLname).thenComparing(byFname);
		
		empList.stream().sorted(byLastAndThenFirst).forEach(System.out::println);
		///Ajith,Bhachan,Khan,khan,Roshan
		//Thala,Amitab,Amir,Sharuk,Hirthik
		
		Map<String,List<Employee>>  grpByDept =empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		grpByDept.forEach((dep,empInDept)->{
			System.out.println(dep);
			empInDept.forEach(System.out::println);
		});
		System.out.println("-------------------------");
		Predicate<Employee> p2 =emp1 -> (emp1.getFname().startsWith("A"));
		empList.stream().filter(p2)
		.sorted(Comparator.comparing(Employee::getFname))
		.forEach(System.out::println);
		
		/*
		printallempindept(dep,empIndept)
		{
			System.out.println(dep);
			Iterator<Employee> i = empIndept.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		*/
	}

}