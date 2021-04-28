<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="container">
		<h3>Search Management System</h3>
		<div class="row">
			<div class="col-md-4">
				<form action="${pageContext.request.contextPath}/EC">

					<div class="form-group">
						<label for="lbleid">Employee ID</label> 
						<input type="text" class="form-control" id="lbleid" name="eid"
							placeholder="Enter EID" />
					</div>
					<button type="submit" class="btn btn-primary" name="action" value="SEARCH">Search Employee</button>
					</form>
			</div>
					
		</div>
		
					
</div>
					
</body>