<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link rel="stylesheet" 
   href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
   integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
   crossorigin="anonymous">
</head>
<body>

	<br>
	<br>
	<br> 
	<div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">EID</th>
					<th scope="col">ENAME</th>
					<th scope="col">DEPT</th>
					
				</tr>
			</thead>
			<tbody>

				<tr>
					<td><c:out value="${emp.eid}"></c:out></td>
					<td><c:out value="${emp.ename}"></c:out></td>
					<td><c:out value="${emp.dept}"></c:out></td>
				</tr>

			</tbody>
		</table>
	</div>
					
</body>