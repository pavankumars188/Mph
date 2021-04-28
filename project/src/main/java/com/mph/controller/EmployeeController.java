package com.mph.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mph.dao.EmployeeDao;
import com.mph.dao.EmployeeDaoImpl;
import com.mph.model.Employee;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDao empdao;

	List<Employee> elist = new ArrayList<Employee>();

	RequestDispatcher rd;

	public EmployeeController() {
		empdao = new EmployeeDaoImpl();

	}

	@Override
	public void init() throws ServletException {
		System.out.println("From init");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("From DO GEEET");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>EMS</title>");
		out.println("</head>");
		out.println("<body>");

		String action = request.getParameter("action");

		switch (action) {
		case "LIST": {
			listEmployee(request, response);
			break;
		}
		case "UPDATE": {
			updateEmployee(request, response);
			break;
		}
		case "EDIT": {
			editEmployee(request, response);
			break;
		}
		case "DELETE": {
			deleteEmployee(request, response);
			break;
		}
		case "SEARCH":{
			searchEmployee(request,response);
			break;
		}
		case "LOGIN":{

			loginEmployee(request, response);
			break;
		}
		case "REGISTER":{
			registerEmployee(request, response);
			break;
		}

		default: {
			listEmployee(request, response);
		}
		}
		out.println("</body>");
		out.println("</html>");

	}
   protected void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee e = empdao.getEmployee(Integer.parseInt(request.getParameter("eid")));
				if(e.getEid() != 0)
						request.setAttribute("emp", e);
				
					rd = request.getRequestDispatcher("view-employee.jsp");
					rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee employee = new Employee();
		employee.setEid(Integer.parseInt(request.getParameter("eid")));
		employee.setEname(request.getParameter("ename"));
		employee.setDept(request.getParameter("dept"));

		if (empdao.save(employee)) {
			request.setAttribute("NOTIFICATION", "Employee Added Sucessfully !!!");
			listEmployee(request, response);

		}
	}

	protected void listEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> emlist = empdao.getAllEmployee();
		request.setAttribute("allemp", emlist);
		rd = request.getRequestDispatcher("employee-list.jsp");
		rd.forward(request, response);
	}

	protected void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));//after eid= delete

		if (empdao.delete(eid)) {
			request.setAttribute("NOTIFICATION", "Employee Deleted Sucessfully !!!");
			listEmployee(request, response);

		}
	}
	
	protected void editEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		rd = request.getRequestDispatcher("edit-employee.jsp");
		rd.forward(request, response);
	}
	protected void updateEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee employee = new Employee();
		employee.setEid(Integer.parseInt(request.getParameter("eid")));
		employee.setEname(request.getParameter("ename"));
		employee.setDept(request.getParameter("dept"));

		if (empdao.update(employee)) {
			request.setAttribute("NOTIFICATION", "Employee Updated Sucessfully !!!");
			listEmployee(request, response);

		}
	}
	protected void loginEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 System.out.println("before dao");
		 boolean employee=empdao.loginAemployee(username, password);
		 System.out.println("in method");
		 if(employee==true)
		 {
			 rd=request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		 }
		 else
		 {
			 rd=request.getRequestDispatcher("register.jsp");
			 rd.forward(request, response);
		 }

	}
	
	protected void registerEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 boolean employee=empdao.registerAemployee(username, password);
		 if(employee==true)
		 {
			 System.out.println("request dispatcher");
			 rd=request.getRequestDispatcher("login.jsp");
			 rd.forward(request, response);
		 }
		
	}
}
