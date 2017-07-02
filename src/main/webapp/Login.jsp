<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="pink">
	<pre>
<h1>welcome,<h2><%  out.println(session.getAttribute("REGISTERED_USER")); %></h2>
			<h1>Login</h1>
		
	<form action="LoginController" method="post">

	<h2>Email Id *   <input type="email" name="email_id" required autofocus>
		
		<br />Password *   <input type="password" name="user_password" required>
		
		<br /><input type="submit" value="Submit">
	</h2>	</form>
	</pre>
</body>
</html>