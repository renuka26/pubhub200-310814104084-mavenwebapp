<%@page import="com.renusush.model.BookInfo"%>
<%@page import="com.renusush.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Requested details</title>

</head>
<body bgcolor="pink"><form action="OrderController" method="post"><pre>
<b><h3>Requested Book Detail</b></h3><pre>
<% 
BookInfo b1=(BookInfo)request.getAttribute("BOOK_DETAIL");
out.println(b1);

%>
<h1>Place your order here,<% out.println(session.getAttribute("LOGGED_IN_USER")); %></h1>
Quantity :<input type="quantity" name="qty" required autofocus><br>

Prodname :<input type="prod_name" name="pname" required><br>

<button>ADD TO CART</button><br>

<a href="home.jsp">cancel</a>
</body></pre></form>
</html>