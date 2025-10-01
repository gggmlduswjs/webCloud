<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
	border : 1px solid black;
	}
	
	td {
	border : 1px solid black;
	}
</style>
</head>
<body>

<% String data = (String)request.getAttribute("data"); %>

<table>
<tr>
<td>
	<!-- 데이터, 모델 -->
	<!-- 화이팅 메시지 -->
	<%= data %>
	<% out.println(data); %>
</td>
</tr>

</table>

</body>
</html>