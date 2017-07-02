<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success message</title>
</head>
<body bgcolor="lightgreen"><pre>
       <b> <h1>YOUR REGISTRATION SUCCEED, <%out.println(session.getAttribute("REGISTERED_USER")); %> !!!</h1></b>
        
  <h2>  Please login to enter book managment system  
    
        <a href="Login.jsp">Sign In</a></h2>
</body>
</html>