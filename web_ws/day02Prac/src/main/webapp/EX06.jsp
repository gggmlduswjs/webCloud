<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    table {
        border : 1px solid black;
    }
</style>
<body>
 <h2> 약수 구하기</h2>
 
 <%
 	// 자바코드
 	int su1=12;
 
 	ArrayList<Integer> list = new ArrayList<>();
 	
 	for(int i=1; i<su1; i++) {
 		if(su1 % i==0) {
 			list.add(i);
 		}
 	}
 	
 	out.println(list.toSting()); // out 객체가 제공됨, out을 통해서 자바코드의 결과를 응답
 
 
 
 %>
 
<table>
<tr>
<td> <%= list.toString() %></td>
</tr>
</table>

 

</body>
</html>