<%@page import="java.util.ArrayList"%>
<%@ page import="day04Prac.Acorn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border : 1px solid black;
}

td{
border : 1px solid black;
}

</style>
</head>
<body>

<% ArrayList<Acorn> list= (ArrayList<Acorn>) request.getAttribute("list"); %>
<%= list  %>
<h2>에이콘 학생정보 조회</h2>


<table>
<tr>
<td>id</td>
<td>pw</td>
<td>name</td>
<td>point</td>
</tr>
<%for(Acorn acorn : list){ %>
<tr>
<td><%=acorn.getId() %></td> 
<td><%=acorn.getPw() %></td>
<td><%=acorn.getName() %></td>
<td><%=acorn.getPoint() %></td>
</tr>

<%} %>
</table>

</body>
</html>