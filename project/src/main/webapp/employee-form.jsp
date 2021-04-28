<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h3>Employee Management System</h3>
		<a href="employee-list.jsp">List Employee</a>
		
		<div class="row">
			<div class="col-md-4">
				<form action="${pageContext.request.contextPath}/EC" method="post">

					<div class="form-group">
						<label for="lbleid">Employee ID</label> 
						<input type="text" class="form-control" id="lbleid" name="eid"
							placeholder="Enter EID" />
					</div>
					<div class="form-group">
						<label for="lblname">Employee Name</label> 
						<input type="text"	class="form-control" id="lblname" name="ename"
							placeholder="Enter Name" />
					</div>
					<div class="form-group">
						<label for="lbldept">Employee Dept</label> 
						<input type="text" class="form-control" id="lbldept" name="dept"
							placeholder="Enter Department" />
					</div>
				<button type="submit" class="btn btn-primary">Add Employee</button>
				</form>
			</div>

		</div>

	</div>
