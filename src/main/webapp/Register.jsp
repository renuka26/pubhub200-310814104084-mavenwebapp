<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body bgcolor="pink"><pre>
<h1><b>Welcome to Book Publishing (PubHub 200)</b></h1>
 

	<h1>New User Registration</h1>
	<form action="RegisterController" method="post">

		Name (*): <input type="text" name="name" required autofocus /> <br />

		Username(*) : <input type="email" name="email_id" required> <br />

		Password(*) : <input type="password" name="user_password" required> <br/>
		
		MobileNo : <input type="number" name="mobileno" required> <br/>
		<br/>
		<br />                         <input type="submit" value="Submit">
	</form></pre>
</body>
</html>