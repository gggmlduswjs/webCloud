package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hellojsp")
public class HellojspServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		 
		
		PrintWriter out  = response.getWriter();
		out.println( "<!DOCTYPE html>");
		out.println( "<html>");
		out.println( "<head> ");
		out.println( "<meta charset=\"UTF-8\"> ");
		out.println( "<title>Insert title here</title>");
		out.println( "</head>");
		out.println( "<body>");
		out.println( " hello jsp^^ ");
		out.println( "</body>");
		out.println( "</html>");		
		
		
		
	}
}