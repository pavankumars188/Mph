<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
    <div class="container">
	
	
	<div class="row">
 			<div class="col-md-4">
 				<table>
 				<tr><td><label for="lbleid">User Name</label> 
				 <input type="text" class="form-control" id="lbleid" name="username" placeholder="Enter username" />
							</div></td></tr>
				   <tr><td><div class="form-group">
					<label for="lblname">Password</label> 
						<input type="password" class="form-control" id="lblname" name="password" placeholder="Enter password" />		
					</div>
					<br/><br/>
					<tr><td><button type="submit" name="action" value="LOGIN"class="btn btn-primary">LOGIN</button></td></tr>		
				<a href="register.jsp">REGISTER HERE</a>
	    
	    </table>
			<form action="${pageContext.request.contextPath}/EC?action=REGISTER" method="get">	 
			</div>

		</div>
</div>	
</body>
</html>