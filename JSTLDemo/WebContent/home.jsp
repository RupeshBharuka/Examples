<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
	<%-- JSTL Tag library added --%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	<style>
		table th td{
			border: 1px solid black;
		}
	</style>
</head>

<body>
	<%-- Using JSTL foreach and out to loop a list and display items in table --%>
	<table>
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>

			<c:forEach items="${requestScope.empList}" var="emp">
				<tr>
					<td><c:out value="${emp.id}"></c:out></td>
					<td><c:out value="${emp.name}"></c:out></td>
					<td><c:out value="${emp.role}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>