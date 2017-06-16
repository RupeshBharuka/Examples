<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<h3 style="color:blue;">${headerMessage}</h3>
	<h2>Student Details :</h2>
	
	<table>
		<tr>
			<td>Name : </td>
			<td>${student.studentName}</td>	
		</tr>
		
		<tr>
			<td>Mobile No : </td>
			<td>${student.mobileNumber}</td>
		</tr>
		
		<tr>
			<td>DOB : </td>
			<td>${student.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Student Skills : </td>
			<td>${student.listOfStudentSkills}</td>
		</tr>
		
		<tr>
			<td><h2>Student Address : </h2></td>
		</tr>
		
		<tr>
			<td>Country : </td>
			<td>${student.studentAddress.countryName}</td>
		</tr>
		
		
		<tr>
			<td>City : </td>
			<td>${student.studentAddress.cityName}</td>
		</tr>
		
		<tr>
			<td>Pin Code : </td>
			<td>${student.studentAddress.pinCode}</td>
		</tr>
	</table>
</body>
</html>