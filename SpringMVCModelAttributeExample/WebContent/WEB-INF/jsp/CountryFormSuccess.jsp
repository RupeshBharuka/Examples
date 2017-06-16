<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color:green;">${headerMessage}</h3>
	<table>
		<tr>
			<td>Country Name : </td>
			
			<!-- country is a ModelAttribute name given in submitCountryDetails method of controller -->
			<!-- We are accessing field by ModelAttribute name -->
			<td>${country.countryName}</td>
		</tr>
		
		<tr>
			<td>PM Name : </td>
			
			<!-- country is a ModelAttribute name given in submitCountryDetails method of controller -->
			<!-- We are accessing field by ModelAttribute name -->
			<td>${country.pmName}</td>
		</tr>
	</table>
</body>
</html>