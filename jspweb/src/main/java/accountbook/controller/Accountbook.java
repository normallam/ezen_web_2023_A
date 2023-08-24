package accountbook.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import accountbook.model.dao.AccountbookDao;
import accountbook.model.dto.AccountbookDto;


@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

    public Accountbook() {
        super();
        // TODO Auto-generated constructor stub
    }
    // 1. 저장
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String atext = request.getParameter("atext"); System.out.println("atext : " + atext);
		String anumber = request.getParameter("anumber"); System.out.println("anumber : " + anumber);
		String adate = request.getParameter("adate"); System.out.println("adate : "+adate);
	
		AccountbookDto accountbookDto = new AccountbookDto(atext, anumber, adate); System.out.println("AccountbookDto : " +accountbookDto);
		boolean result = AccountbookDao.getInstance().awrite(accountbookDto);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
	
	}
    
	// 2. 호출
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<AccountbookDto> result = AccountbookDao.getInstance().aread();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString(result);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(jsonArray);
	}


	// 3. 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int ano = Integer.parseInt(request.getParameter("ano"));		System.out.println("ano" + ano); 
		String atext = request.getParameter("atext");					System.out.println("atext" + atext);
		String adate = request.getParameter("adate");					System.out.println("adate" + adate);
		
		boolean result = AccountbookDao.getInstance().aupdate(ano,atext,adate);
	
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
		
	}

	// 4. 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ano = Integer.parseInt(request.getParameter("ano"));		System.out.println("ano" + ano);
		
		boolean result = AccountbookDao.getInstance().adelete(ano);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
		
	}

}
