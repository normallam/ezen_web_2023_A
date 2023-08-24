package accountbook.model.dao;

import java.io.Console;
import java.util.ArrayList;

import accountbook.model.dto.AccountbookDto;
import model.dao.VisitDao;

public class AccountbookDao extends Dao{

	// 0. 싱글톤
		private static AccountbookDao AccountbookDao = new AccountbookDao();
		private AccountbookDao() {}
		public static AccountbookDao getInstance() {return AccountbookDao;}

	// 1. 저장	
	public boolean awrite(AccountbookDto accountbookDto) {
		
		try {
			String sql = "insert into accountbook(atext,anumber,adate) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, accountbookDto.getAtext());
			ps.setString(2, accountbookDto.getAnumber());
			ps.setString(3, accountbookDto.getAdate());
			int row = ps.executeUpdate();
			System.out.println("row : "+row);
			if(row==1) { System.out.println("row까지는 왔다?");
				return true;
			}
		}catch(Exception e) {System.out.println(e);}
		
		return false;}
	// 2. 호출	
	public ArrayList<AccountbookDto> aread() {
			
		ArrayList<AccountbookDto> list = new ArrayList<>();
		
		try {
			String sql = "select * from accountbook";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				AccountbookDto accountbookDto = new AccountbookDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				list.add(accountbookDto);
				System.out.println("list출력"+list);
			}
		}catch(Exception e) {System.out.println(e);}	
		return list;	
	}
		
	// 3. 수정	
	public boolean aupdate(int ano, String atext, String adate) {
			
		try {
			String sql = "update accountbook set atext = ? , adate = ? where ano = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(3, ano); ps.setString(1, atext); ps.setString(2, adate);
			int row = ps.executeUpdate();
			if(row==1) return true;
			return false;
		}catch(Exception e) {System.out.println(e);}
		
		return false;
	}
		
	// 4. 삭제	
	public boolean adelete(int ano) {
			
		try {
			String sql = "delete from accountbook where ano =?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, ano);
			int row = ps.executeUpdate();
			if(row==1) return true;
		}catch(Exception e) {System.out.println(e);}	
			
		return false;	
	}
	
	
}// class e
