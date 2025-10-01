<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[] list =(String[]) request.getAttribute("data");

%>

<h3>사칙 연산의 결과</h3>

<table>

<%for(int i=0; i<list.length;i++){ %>
<tr>
<td><%=list[i] %></td>
</tr>
<%} %>

</table>


<h3>사칙 연산의 결과</h3>

<table>
<tr>
<td><%=list[0] %></td>
</tr>
<tr>
<td><%=list[1] %></td>
</tr>
<tr>
<td><%=list[2] %></td>
</tr>
<tr>
<td><%=list[3] %></td>
</tr>

</table>

</body>
</html>