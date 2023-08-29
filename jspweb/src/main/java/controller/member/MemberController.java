package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.MemberDao;
import model.dto.MemberDto;

@WebServlet("/MemberInfoController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }
    // 1. [C] (첨부파일 없을때)회원가입
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 첨부파일 저장할 폴더의 절대경로
		String uploadpath = "C:\\Users\\504\\git\\ezen_web_2023_A\\jspweb\\src\\main\\webapp\\member\\img"; // 첨부파일 저장할 경로
		
		// 첨부파일 전송 했을 때
			// 1. 첨부파일 서버PC에 업로드(COS 라이브러리)
				// MultipartRequest : 파일 업로드 클래스
			MultipartRequest multi = new MultipartRequest(
					request, 		// 1. HttpServletRequest요청방식
					uploadpath, 	// 2. 첨부파일을 저장할 폴더 경로
					1024*1024*10,	// 3. 첨부파일 용량 허용범위[바이트단위]10MB
					"UTF-8",		// 4. 한글인코딩타입
					new DefaultFileRenamePolicy()// 5.[파일명중복제거] 만약에 서버내 첨부파일이 동일한 이름이 있을때 이름 뒤에 숫자를 자동으로 붙이기 [보안]
					);
		
		// ----------------------------------- DB처리 ------------------------------------------------//
			
			// 2. form 안에 있는 각 데이터 호출
		// 일반input : multi.getParameter("form객체전송시input name");
		// 첨부파일input : multi.getFilesystemName();
		
		String mid =  multi.getParameter("mid");			System.out.println("mid : "  + mid);
		String mpwd =  multi.getParameter("mpwd");		System.out.println("mpwd : "  + mpwd);
		String memail =  multi.getParameter("memail");	System.out.println("memail : "  + memail);
		String mimg =  multi.getParameter("mimg");		System.out.println("mimg : "  + mimg);
		
		// 2. (선택) 객체화.
		MemberDto memberDto = new MemberDto(mid, mpwd, memail, mimg);
		// 2. (선택) 유효성검사.
		
		// 3. Dao 에게 전달하고 결과 받는다.
		boolean result = MemberDao.getInstance().signup(memberDto);
		
		// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다. [ response ]
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
		
		
	}
	
	// 2. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}