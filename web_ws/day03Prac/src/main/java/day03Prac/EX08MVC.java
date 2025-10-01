package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ex08 서블릿 단독 응답 => MVC로 응답하기
// 랜덤한 응원메시지 요청에 대한 응답주기
// model : 자바 (데이터 만드는 일)
// controller : 서블릿 (요청을 받아서 흐름을 컨트롤)
// view : jsp (화면을 만드는 일)

@WebServlet("/msg/random/mvc")
public class EX08MVC extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 요청 정보 가져오기
		
		// 랜덤한 화이팅 메시지 (데이터) => 자바(랜덤한 화이팅 메시지를 제공하는 Service)
		EX08Service service = new EX08Service();
		String data=service.getRandomMessage(); // Model
		
		// 함께 쓰는 저장소에 데이터 심기
		request.setAttribute("data", data);
		
		//응답할 view로 forward 하기(거쳐서 응답하기, view로 보내기)
		
		request.getRequestDispatcher("/WEB-INF/views/EX08View.jsp").forward(request,response);
		
	}
}
