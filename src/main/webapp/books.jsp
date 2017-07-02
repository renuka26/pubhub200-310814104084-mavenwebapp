<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AVAILABLE BOOKS</title>
</head>
<body bgcolor="pink">
<form action="BookInfo" method="post">
<pre><h2>WELCOME  ,<%out.println(session.getAttribute("LOGGED_IN_USER") );%></h2>

 Enter book name which you want to view
<input type="Book name" name="bookname" required autofocus>
<button>view</button>
    
</body></pre>
</html>