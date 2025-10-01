<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>로그인</h2>
<%
   boolean result = (Boolean) request.getAttribute("data");
   if(result){
%>
   <h3>로그인 성공</h2>
<%
   } else {
%>
   <h3>로그인 실패 </h2>
<%
   }
%>


</body>
</html>