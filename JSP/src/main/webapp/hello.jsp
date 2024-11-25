<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%out.println("Mensagem renderizada com comando java no jsp");%>
	<%--Uso do elemento expressão --%>
	<p> Data: <%=new Date() %><p>
	<%!int contador=0; %>
	<p>Visitas: <%=contador++%></p>
</body>
</html>