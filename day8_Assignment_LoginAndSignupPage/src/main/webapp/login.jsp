<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assignment DAY-8 LoginPage</title>
</head>
<body>

	<h1>Login Page</h1>
	
	<form action="login"  method = "get">
	<label>UserName:  </label>
	<input type="text" name= "uname" placeholder="enter the name"><br><br>
	<label>Password: </label>
	<input type="password" name="pwd"  placeholder="enter the password"><br><br>
	<button>Login</button>
	</form>
	<br>
	
	New User:- <a href="signup.jsp"> SignUp </a>
</body>
</html>