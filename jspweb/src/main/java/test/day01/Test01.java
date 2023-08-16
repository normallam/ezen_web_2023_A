package test.day01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*

*/


@WebServlet("/Test01") // 해당 클래스의 URL주소 // 해당 클래스를 호출하고 싶으면 http://localhost/jspweb/Test01
public class Test01 extends HttpServlet { // !!!! : HttpServLet서블릿클래스 상속
	private static final long serialVersionUID = 1L;


    public Test01() {}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> JS input ...");	
		response.getWriter().append(">>> JS output : Hello world").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
