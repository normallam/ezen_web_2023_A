package controller.hrm;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.HrmDao;
import model.dto.HrmDto;


@WebServlet("/HrmController")
public class HrmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HrmController() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<HrmDto> result = HrmDao.getInstance().view();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString(result);// json 타입으로 변환은 불가능하지만 json형식의 문자열로 변환
		// 4. 응답
		//response.getWriter().print(result); // 응답은 가능하나 문자타입으로 전송되므로 js가 타입 사용 불가능 [ 문제 발생 ]
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(jsonArray);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("컨트롤러 들어옴 ");
		String uploadpath = request.getSession().getServletContext().getRealPath("/hrm/img");
		System.out.println("hrm 폴더 img 폴더 실제(서버)경로 : "+uploadpath);
    	
    	MultipartRequest multi = new MultipartRequest(
				request , 		// 1. HttpServletRequest 요청방식 
				uploadpath , 	// 2. 첨부파일을 저장할 폴더 경로 
				1024*1024*10,	// 3. 첨부파일 용량 허용 범위 [ 바이트단위 ] 10MB
				"UTF-8" , 		// 4. 한글인코딩타입 
				new DefaultFileRenamePolicy()	// 5. [파일명중복제거] 만약에 서버내 첨부파일의 동일한 이름이 있을때 이름뒤에 숫자를 자동으로 붙이기 
				);
    	
    	String epi = multi.getFilesystemName("epi"); 	System.out.println("epi : "+epi);
    	String ename = multi.getParameter("ename");		System.out.println("ename : "+ename);
    	String ecall = multi.getParameter("ecall");	System.out.println("ecall : "+ecall);
    	String egrade = multi.getParameter("egrade"); System.out.println("egrade : "+egrade);
    	String eredate = multi.getParameter("eredate");		System.out.println("eredate : "+eredate);
    	if(epi == null) {epi = "default.webp";}
    	
    	HrmDto hrmDto = new HrmDto(epi, ename, ecall, egrade, eredate);
    	// 2. (선택) 유효성검사
    	
    	
    	// 3. dao에게 전달하고 결과 받는다
    	boolean result = HrmDao.getInstance().regist(hrmDto);
    	// 4. ajax 통신으로 결과 데이터를 응답을 보낸다 [리스폰]
    	response.setContentType("application/json;charset=UTF-8");
    	response.getWriter().print(result);
	}

	}


