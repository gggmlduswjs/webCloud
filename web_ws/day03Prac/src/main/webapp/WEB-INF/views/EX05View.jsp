<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>별찍기</title>
</head>
<body>

<% 
    String[] data = (String[])request.getAttribute("data"); 
%>

<h3>별찍기</h3>

<%
    if(data != null) {
        for(String line : data) {
            out.println(line + "<br>");
        }
    }
%>

</body>
</html>
