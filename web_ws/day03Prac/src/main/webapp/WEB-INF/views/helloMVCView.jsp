<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box{
	border : 1px solid black;
	width : 300px
}
</style>
</head>
<body>

<!-- 화면 이쁘게 만들기 -->
<!-- 저장소 request에 저장된 데이터 꺼내기 -->
<!-- 데이터와 함께 이쁘게 응답하기 -->
<!-- 보여주는 역할만 한다 여기서 실행하거나 그러지 않음 view만 담당 -->

 Hello MVC View 이다
 
 <% String str=(String) request.getAttribute("data"); %>
 
 <div class="box">
 	<%=str %>
 </div>
 
</body>
</html>