<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
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

<!-- jsp 내장객체 request, response, out -->

<%
    // 파라미터 받기
    String num_ = request.getParameter("su1");
    int su1 = 12;   // 기본값 (테스트용)

    if(num_ != null && !num_.isEmpty()){
        su1 = Integer.parseInt(num_);
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(int i=1; i<=su1; i++){
        if(su1 % i == 0){
            list.add(i);
        }
    }

    out.println(list.toString()); // 디버깅용 출력
%>

<h2>약수 구하기</h2>

<table>
<tr>
<td> <%= list.toString() %></td>
</tr>
</table>

</body>
</html>
