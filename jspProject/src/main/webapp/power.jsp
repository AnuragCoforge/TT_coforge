<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for (int i=1; i<=15; i++)
	if(i%2==0)
	out.println(i+"<br>");
	%>
	
	<% String fruits[]={"banana", "apple", "strawberry"};%>
	<%for(String fruit:fruits)
		out.println(fruit);%>
		
		
	
	<%@page import="java.util.Date" %>
	<% Date date=new Date(); %>
	<%=date %>
	
	 <form>
               <div class="mb-3">
               <label class="form-label mt-2">First Number.</label>
               <input type="text" class="form-control" name="p1" required>
               <label class="form-label mt-2">Second Number</label>
               <input type="text" class="form-control" name="p2" required>
               <button class="btn btn-success mt-5">Calculation</button>
               </div>
              </form>
              
              	<%@page import="java.lang.Math" %>
 
	
<%
String n1 = request.getParameter("p1");
String n2 = request.getParameter("p2");
if (n1!=null&& n2!=null)
{
    out.println(Math.pow(Double.parseDouble(n1), Double.parseDouble(n2)));
}
%>
	
	
	<%@ include file = "header.jsp" %>
	
	
	              
</body>
</html>