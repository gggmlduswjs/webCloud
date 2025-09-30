package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 만들기 : 두 수를 사용자로부터 받아서 사칙연산 결과 제공하기
//1) HttpServlet 상속받기
//2) 약속된 메서드 service() 오버라이드
//3) 서블릿 등록하기(url 요청 이름과 함께 등록해야 함)

@WebServlet("/calc")
public class Ex01 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사칙연산 결과 제공하기
		//간단한 테스트 서블릿 동작하는지 확인
		
		//요청 관련된 것은 request 객체
		//응답 관련된 것은 response 객체
		
		//사칙연산 제공
		//사용자 요청데이터로 변경하기
		
//		int su1 = 10;
//		int su2 = 3;
		
		//사용자 요청정보(클라이언트)는 request  객체로부터 getParameter()로 얻어온다, 사용자가 값을 전달하지 않으면 null을 반환한다
		
		int su1 = Integer.parseInt(request.getParameter("num1"));
		int su2 = Integer.parseInt(request.getParameter("num2"));
		
		//처음실행 시  num1, num2가 전달되지 않으면 null을 Integer.parseInt() 메서드에서 예외가 발생함
		int result1 = su1 + su2;
		int result2 = su1 - su2;
		int result3 = su1 * su2;
		double result4 = su1 / su2;
		
		//한글설정 보내는 데이터의 type 설정
		//주의 사항 -> getWriter() 보내는 기반스트림(통로)를 얻어오기 전에 설정해야 한다
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");		
		out.println("두 수의 합 : " + result1 + "<br>");
		out.println("두 수의 차 : " + result2 + "<br>");
		out.println("두 수의 곱 : " + result3+ "<br>");
		out.println(" 두 수의 나누기 : " + result3+ "<br>");		
		out.println("</body>");
		out.println("</html>");
	}

}
