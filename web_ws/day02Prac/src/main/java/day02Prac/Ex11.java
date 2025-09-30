package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food")
public class Ex11 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		//
		String[] menus = {
		    "떡볶이", 
		    "돈까스", 
		    "피자", 
		    "비빔밥",
		    "순대국밥",
		    "마라탕"
		};
		
		String[] images = {
				"/day02Prac/food1.png",
				"/day02Prac/food2.png",
				"/day02Prac/food3.png",
				"/day02Prac/food4.png",
				"/day02Prac/food5.png",
				"/day02Prac/food6.png"
		};
		
		Random random = new Random();
		
		int randomIndex = random.nextInt(menus.length);
		
		String chooseMenu = menus[randomIndex];
		String chooseImage = images[randomIndex];
		
		//
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>오늘의 점심 메뉴 추천은 " + chooseMenu + " !!!</h2>");
		out.println("<img src='" + chooseImage + "' style='width:400px;'>");
		out.println("</body>");
		out.println("</html>");
	}
}