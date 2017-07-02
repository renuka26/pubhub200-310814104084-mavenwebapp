<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="lightgreen"><pre>
<b><h3>YOUR LOGIN SUSCEED, </h3><h1><%out.println(session.getAttribute("LOGGED_IN_USER")); %></h1></b>
<h1>OPTIONS</h1><h2>
Do you want to see the books available?<br>

<a href="/Bookapp200-web/ViewServlet">Books Available</a>
	<br>
Place your order here

	<a href="myorders.jsp">My Orders</a>
</body>
</html>