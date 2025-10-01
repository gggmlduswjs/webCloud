package day03Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 3단요청 -> 3단 제공하기
// 서블릿 -> MVC로 마늗ㄹ기
//Model
//View
//Controller
//GET, POST ( GET 요청)
@WebServlet("/danMVC")
public class EX02MVC extends HttpServlet{

	// 모든 요청을 처리함
	
		/*
		  
		 ////부모의  service하는 일이  너의 요청정보에 맞는    doGET 또는  doPOST를 호출한다.	
		 req.getMethod(); // 이정보로 GET, POST  요청을 확인하고  doGet,  doPost  각 각 호출한다  
		 
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		}	
		 */
	
	// 서블릿 -> service(request.getMethod() 확인) get, post에 맞는 -> doGet, doPost를 호출함
	// 서블릿 하나가 get, post 요청을 처리할 수 있다.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 정보 꺼내오기
		// 3단정보 만들기 - 모델
		//
		
		 ArrayList<String> dan = new ArrayList<>();
		 dan.add("3*1="+3*1);
		 dan.add("3*2="+3*2);
		 dan.add("3*3="+3*3);
		 dan.add("3*4="+3*4);
		 dan.add("3*5="+3*5);
		 dan.add("3*6="+3*6);
		 dan.add("3*7="+3*7);
		 dan.add("3*8="+3*8);
		 dan.add("3*9="+3*9);
		 
		 
		 
		// request 저장소에 심기
		 
		 
		 request.setAttribute("data", dan);
		 
		// jsp로 뷰로 응답하기
		 
		 request.getRequestDispatcher("/WEB-INF/views/EX02View.jsp").forward(request, response);
		
		//
	}
	
	
	

}
