<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<h2 style="color:blue;">${headerMessage}</h2>
	<h3 style="color:green;">Student Admission Form</h3>
	
	<!-- form:errors tag provided by Spring MVC. To use Spring tags we need to add special tag library -->
	<form:errors cssStyle="color:red;" path="student.*"/>
	<!-- Not working <form:errors cssStyle="color:red;" path="student1.*"/> -->
	<form action="submitAdmissionForm.html" method="POST">
		<table>
			<tr>
				<td>Name : </td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			
			<tr>
				<td>Mobile no : </td>
				<td><input type="text" name="mobileNumber"></td>
			</tr>
			
			<tr>
				<td>DOB(Date of Birth) : </td>
				<td><input type="text" name="studentDOB"></td>
			</tr>
			
			<tr>
				<td>Student Skills Set : </td>
				<td>
					<select name="listOfStudentSkills" multiple>
						<option value="Java core">Java core</option>
						<option value="Spring core">Spring core</option>
						<option value="Spring MVC">Spring MVC</option>
					</select>
				</td>
			</tr>
					
			<tr>
				<td><h3 style="color:green;">Student's Address : </h3></td>
			</tr>
			
			<tr>
				<td>Country : </td>
				<td><input type="text" name="studentAddress.countryName"></td>
			</tr>
			
			<tr>
				<td>City : </td>
				<td><input type="text" name="studentAddress.cityName"></td>
			</tr>
			
			<tr>
				<td>Pin Code : </td>
				<td><input type="text" name="studentAddress.pinCode"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form>
</body>
</html>