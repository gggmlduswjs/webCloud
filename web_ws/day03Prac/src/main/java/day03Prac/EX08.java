package day03Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 (요청에 대한 응답, 랜덤한 화이팅 메세지 요청 -> 렌덤한 화이팅 메세지를 응답)
// 1. HttpServlet 상속
// 2. service 매서드 오바라이드 (요청에 맞는 기능 만들기)
// 3. 서블릿 등록(@WebServlet ("/msg/random")
@WebServlet("/msg/random")
public class EX08 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		
		//
		
//		String [] list = new String[5];
		String [] list = new String[] {
				"🚀 오늘도 멋지게! 작은 한 걸음이 큰 변화를 만든다!",
				"🌈 힘들 땐 잠깐 쉬어가도 괜찮아, 결국 끝까지 가는 게 승리야!",
				"💪 네가 해온 모든 노력은 절대 배신하지 않아. 파이팅!",
				"🌟 오늘의 너는 어제보다 더 강해졌다! 자신감을 가지고 나아가자!",
				"🔥 할 수 있다! 아니, 이미 해내고 있다!"
		};
		
		//0 1 2 3 4 => 5개
		
//		Math.random();
		
		Random r=new Random();
		int randomIndex = r.nextInt(list.length); // 5 -> 0 1 2 3 4
		
		System.out.println(randomIndex);
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style> .box {border : 1px solid green; width:200px; height :100px;}</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class =/box\">"+list[randomIndex]+"</div>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
