<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employees</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	List of Employees

	<input type="submit" value="Add Employee"
		onclick="window.location.href='employee-form.jsp'" />
	<br><br><br>
	${NOTIFICATION}
	<div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">EID</th>
					<th scope="col">ENAME</th>
					<th scope="col">DEPT</th>
					<th scope="col" colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<td><c:out value="${employee.eid}"></c:out></td>
						<td><c:out value="${employee.ename}"></c:out></td>
						<td><c:out value="${employee.dept}"></c:out></td>
						<td><a href="${pageContext.request.contextPath}/EC?action=EDIT&eid=${employee.eid}&ename=${employee.ename}&dept=${employee.dept}">EDIT</a></td>
						<td><a href="${pageContext.request.contextPath}/EC?action=DELETE&eid=${employee.eid}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>