<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Employee Form</title>
</head>

<body>
	<form action="save" method="post">
		<h2>Enter Employee Details</h2>
		
		<table>
			<tr>
				<td>Id : </td>
				<td><input type="text" name="employeeId"></td>	
			</tr>
		
			<tr>
				<td>First Name : </td>
				<td><input type="text" name="firstName"></td>	
			</tr>
			
			<tr>
				<td>Last Name : </td>
				<td><input type="text" name="lastName"></td>	
			</tr>
			
			<tr>
				<td>Designation : </td>
				<td><input type="text" name="designation"></td>	
			</tr>
			
			<tr>
				<td>Basic Salary : </td>
				<td><input type="text" name="basicSalary"></td>	<!-- "number" can also be taken -->
			</tr>
			
			<tr>
				<td>
					<input type="submit" name="Submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>