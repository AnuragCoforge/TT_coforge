<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.coforge.models.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
	<%
		Employee emp=(Employee) request.getAttribute("employee");
		boolean editMode=(emp!=null);
	%>
	<div class="container mt-4">
		<div class="card shadow">
			<div class ="card-header bg-dark text-white">
				<h3><%= editMode?"Edit Employee":"Add Employee" %></h3>
			</div>
			<div class="card-body">
				<form action="employee" method="post">
					<input type="hidden" name="eid" value='<%= editMode?emp.getEid():"" %>'>
					<div class="mb-3">
						<label class="form-label">Employee Name:</label>
						<input type="text" class="form-control" name="ename" value='<%= editMode?emp.getEname():"" %>'>
					</div>
					<div class="mb-3">
						<label class="form-label">Employee Salary:</label>
						<input type="text" class="form-control" name="salary" value='<%= editMode?emp.getSalary():"" %>'>
					</div>
					<div class="mb-3">
						<label class="form-label">Employee Email:</label>
						<input type="text" class="form-control" name="email" value='<%= editMode?emp.getEmail():"" %>'>
					</div>
					<div class="mb-3">
						<label class="form-label">Employee Mobile Number:</label>
						<input type="text" class="form-control" name="mobile" value='<%= editMode?emp.getMobile():"" %>'>
					</div>
					<div class="mb-3">
						<label class="form-label">Employee DOJ:</label>
						<input type="text" class="form-control" name="doj" value='<%= editMode?emp.getDoj():"" %>'>
					</div>
					<div class="mb-3">
						<label class="form-label">Employee DOB:</label>
						<input type="text" class="form-control" name="dob" value='<%= editMode?emp.getDob():"" %>'>
					</div>
					<button type="submit" class="btn btn-success"><%= editMode?"Edit Employee" :"Save Employee" %></button>
					<a href="employee?action=list" class="btn btn-primary">Back</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>