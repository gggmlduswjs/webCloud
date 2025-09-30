package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 만들기 : 사용자로부터 수를 받아서 그 수에 대한 약수 정보 응답하기
 * 
 * 1) HttpServlet 상속받기
 * 2) service 메서드 오버라이드 (약수 정보 만들어서 응답하기)
 * 3) 서블릿 등록하기("/divisor") => 매핑정보
 * 4) 사용자정보 전달 => /divisor?num=12
 * */

@WebServlet("/divisor")
public class Ex06 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//사용자 정보 가져오기
		String num_ =  request.getParameter("num");
		
		if(num_ == null) {
			return;
		}
		int num = Integer.parseInt(num_);
	
		//num에 대한 약수 구하기
		//12 => 1, 2, 3, 4, 6, 12
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				//i는 num 약수
				list.add(i);
			}
		}
		System.out.println(list.toString());
		
		//응답
		out.println(num + " 약수 결과 ");
		out.println(list.toString());
	}
}
