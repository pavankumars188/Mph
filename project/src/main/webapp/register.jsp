<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
  
      <div class="form-group">
            <label for="lbleid">UserName Here</label> 
			 <input type="text" class="form-control" id="lbleid" name="username" placeholder="Enter username" />
	  </div>
	  <div class="form-group">
		     <label for="lblname">Password here</label> 
			 <input type="text"	class="form-control" id="lblname" name="password" placeholder="Enter password" />		
	  </div>
    <button type="submit" name="action" value="REGISTER"class="btn btn-primary">REGISTER... <a href="employee-form.jsp">Add Employee</a>
	<a href="${pageContext.request.contextPath}/EC?action=LIST">List Employee</a>
	<a href="search-employee.jsp">search Employee</a></button>	
 </form>
							


</body>
</html>