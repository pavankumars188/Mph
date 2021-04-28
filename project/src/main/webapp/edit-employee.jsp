<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	
	
	<div class="container">
		<h3>Edit your record here</h3>
		<a href="${pageContext.request.contextPath}/EC?action=LIST">List Employee</a>
		
		<div class="row">
			<div class="col-md-4">
				<form action="${pageContext.request.contextPath}/EC?action=UPDATE" method="get">

					<div class="form-group">
						<label for="lbleid">Employee ID</label> 
						<input type="text" class="form-control" id="lbleid" name="eid"
							placeholder="Enter EID" value="${param.eid}" readonly/>
					</div>
					<div class="form-group">
						<label for="lblname">Employee Name</label> 
						<input type="text"	class="form-control" id="lblname" name="ename"
							placeholder="Enter Name" value="${param.ename}"/>
					</div>
					<div class="form-group">
						<label for="lbldept">Employee Dept</label> 
						<input type="text" class="form-control" id="lbldept" name="dept"
							placeholder="Enter Department" value="${param.dept}" />
					</div>
				<button type="submit" name="action" value="UPDATE" class="btn btn-primary">Update Employee</button>
				</form>
			</div>

		</div>

	</div>
	
</body>
</html>