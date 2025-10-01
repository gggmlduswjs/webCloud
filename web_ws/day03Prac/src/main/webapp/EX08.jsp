
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.box1 {
border:1px solid green;
width:400px;
height:100px;
text-align:center;
line-height:100px
}

.box2 {
border:1px solid red;
width:400px;
height:100px;
text-align:center;
line-height:100px
}

</style>
</head>
<body>

<% //자바코드

String [] list = new String[] {
		"🚀 오늘도 멋지게! 작은 한 걸음이 큰 변화를 만든다!",
		"🌈 힘들 땐 잠깐 쉬어가도 괜찮아, 결국 끝까지 가는 게 승리야!",
		"💪 네가 해온 모든 노력은 절대 배신하지 않아. 파이팅!",
		"🌟 오늘의 너는 어제보다 더 강해졌다! 자신감을 가지고 나아가자!",
		"🔥 할 수 있다! 아니, 이미 해내고 있다!"
};

//0 1 2 3 4 => 5개

//Math.random();

//java.util.Random r=new java.util.Random();
Random r=new Random();
int randomIndex = r.nextInt(list.length); // 5 -> 0 1 2 3 4

System.out.println(randomIndex);

out.println(list[randomIndex]);
%>

<h2>out객체를 이용해서 응답하기</h2>
<div class="box1"> <%out.println(list[randomIndex]); %></div>

<h2>표현식을 이용해서 응답하기(심플하게)</h2>

<div class="box2"><%= list[randomIndex] %></div>

</body>
</html>