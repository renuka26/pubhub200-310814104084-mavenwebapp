<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Suceed</title>
</head>
<body bgcolor="green"><pre><form action="ViewOrderController" method="post">
              <h1> <b>YOUR ORDER HAS BEEN SUCEESFULLY PLACED!!!</b></h1><h3>  ,<% out.println(session.getAttribute("LOGGED_IN_USER")); %></h3>
               
               
               <button>view your orders</button>
	<br>
	

</body>
</html>