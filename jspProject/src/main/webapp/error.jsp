<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style = "color: red">Error, Please enter correct name</h3> 
	
	<%
		out.println("Exception Occured: " + exception);
		out.println("message: "+ exception.getMessage());
		out.println("exception class: "+ exception.getClass());
	%>
</body>
</html>