<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>3단</h2>
	
	<% ArrayList<String> list=(ArrayList<String>) request.getAttribute("data"); %>
	
	<%= list.get(0) %>
	<%= list.get(1) %>
	<%= list.get(2) %>
	<%= list.get(3) %>
	<%= list.get(4) %>
	<%= list.get(5) %>
	<%= list.get(6) %>
	<%= list.get(7) %>
	<%= list.get(8) %>
	
	<h2>3단</h2>
	
	
<table>

<% for(String item : list) { %>
<tr>
<td><%=item %></td>
</tr>
<%} %>
</table>
	
</body>
</html>