package com.mph.dao;
import java.util.ArrayList;
import java.util.List;

import com.mph.model.Employee;
import com.mph.util.MyDBConnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection connection =null;
	Statement statement =null;
	PreparedStatement ps =null;
	ResultSet resultset =null;
	List<Employee> emplist;
	Employee employee;
	
	@Override
	public List<Employee> getAllEmployee() {
		emplist = new ArrayList<Employee>();
		
		
		try {
			connection=MyDBConnection.getDBConnection();
			System.out.println(connection);
			statement = connection.createStatement();
			resultset=statement.executeQuery("select * from mphemp");
			
			while(resultset.next())
			{
				employee = new Employee();
				employee.setEid(resultset.getInt("eid"));
				employee.setEname(resultset.getString("ename"));
				employee.setDept(resultset.getString("dept"));
				emplist.add(employee);
				
			}
			System.out.println("From List DAO" + emplist);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return emplist;
	}

	
	@Override
	public boolean save(Employee emp) {
		boolean flag =false;
		connection=MyDBConnection.getDBConnection();
		try {
			ps = connection.prepareStatement("insert into mphemp(eid,ename,dept) values(?,?,?)");
			ps.setInt(1,emp.getEid());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getDept());
			int noofrows= ps.executeUpdate();
			System.out.println(noofrows + " inserted successfully !!!");
			flag=true;		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean update(Employee emp) {
		boolean flag =false;
		connection=MyDBConnection.getDBConnection();
		try {
	String sql = "update mphemp set ename ='" + emp.getEname() +"'," +"dept = '" + emp.getDept() +"' where eid =" +emp.getEid();
			ps = connection.prepareStatement(sql);
			int noofrows = ps.executeUpdate();
			if(noofrows>=1)
			{
			flag =true;
			}
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}

	@Override
	public boolean delete(int eno) {
		boolean flag =false;
		connection=MyDBConnection.getDBConnection();
		try {
			ps = connection.prepareStatement("delete from mphemp where eid= " + eno);
			int noofrows = ps.executeUpdate();
			if(noofrows>=1)
			{
			flag =true;
			}
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public Employee getEmployee(int eno){
		connection = MyDBConnection.getDBConnection();
		Employee emp= new Employee();
		try {
			statement = connection.createStatement();
			resultset=statement.executeQuery("select eid,ename,dept from mphemp where eid=" +eno);
			
			
			while(resultset.next())
			{
				
				emp.setEid(resultset.getInt("eid"));
				emp.setEname(resultset.getString("ename"));
				emp.setDept(resultset.getString("dept"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return emp;
	}
	public boolean loginAemployee(String username, String password) {
		boolean flag=false;
		String uname = null;
		String upass = null;
		try {
			connection=MyDBConnection.getDBConnection();
			statement = connection.createStatement();
			ps=connection.prepareStatement("select * from login where uname=? and upass=?");
			ps.setString(1, username);
			ps.setString(2, password);
			int noofrows=ps.executeUpdate();
			if(noofrows>=1)
			{
				flag=true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean registerAemployee(String username, String password) {
		boolean flag=false;
		String uname = null;
		String upass = null;
		try {
			connection=MyDBConnection.getDBConnection();
			statement = connection.createStatement();
			ps=connection.prepareStatement("insert into login(uname,upass) values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			int noofrows=ps.executeUpdate();
			if(noofrows>=1)
			{
				flag=true;
			}
			else
			{
				System.out.println("norecords");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	  public static void main(String[] args) {
	  
	  EmployeeDaoImpl e = new EmployeeDaoImpl();
	  System.out.println(e.getAllEmployee()); 
	  }
	 

}