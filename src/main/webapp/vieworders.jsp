<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search result</title>
</head>
<body bgcolor="pink">
	<table border="1">

		<h2>
			WELCOME ,<%
			out.println(session.getAttribute("LOGGED_IN_USER"));
		%>
		</h2>
		
		
			<h5>order details are ,<%
			out.println(session.getAttribute("ORDER_DETAIL"));
		%></h5>
		
		<thead>
			<tr>
				<th>orderid</th>
				<th>product_name</th>
				<th>quantity</th>
				<th>status</th>
				<th>mailid</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="order1" items="${ORDER_DETAIL}">
				<tr>
					<td>${order1.orderid}</td>
					<td>${order1.product_name}</td>
					<td>${order1.quantity}</td>
					<td>${order1.status}</td>
					<td>${order1.mailid}</td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>