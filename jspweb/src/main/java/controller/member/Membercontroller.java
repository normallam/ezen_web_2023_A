package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;


@WebServlet("/Membercontroller")
public class Membercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Membercontroller() {
        super();
    }

    // 1. 회원가입[C]
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. AJAX 통신받은 data객체의 '속성명' 요청한다.[request]
    	String mid = request.getParameter("mid");			System.out.println("mid"+mid);
    	String mpwd = request.getParameter("mpwd");			System.out.println("mpwd"+mpwd);
    	String memail = request.getParameter("memail");		System.out.println("memail"+memail);
    	String mimg = request.getParameter("mimg");			System.out.println("mimg"+mimg);
    	// 2. (선택) 객체화
    	MemberDto memberDto = new MemberDto(mid, mpwd, memail, mimg); System.out.println("memberDto :"+ memberDto);
    	// 3. Dao 에게 전달하고 결과 받는다.
    	boolean result = MemberDao.getInstance().signup(memberDto);
    	// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다.[response]
    	response.setContentType("application/json;charset=UTF-8");
    	response.getWriter().print(result);
    	
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
