<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Homepage</title>
</head>

<body>
	<!-- 
		"hello" will help DispatcherServlet to find request mapping in controller with the same name
		 Note: .html will be ignored while searching for the request mapping
	-->
	<h3>Check all the links by clicking</h3>
	<a href="hello" target="_blank">Hello</a>
	<br/>
	<a href="welcome.html" target="_blank">Welcome</a>
	<br/>
	<a href="goodmorning.html" target="_blank">Wish</a>
</body>
</html>