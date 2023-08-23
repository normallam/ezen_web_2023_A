package accountbook.model.dao;

import accountbook.model.dto.AccountbookDto;
import model.dao.VisitDao;

public class AccountbookDao extends Dao{

	// 0. 싱글톤
		private static AccountbookDao AccountbookDao = new AccountbookDao();
		private AccountbookDao() {}
		public static AccountbookDao getInstance() {return AccountbookDao;}
	
	// 1. 저장	
	public boolean awrite(AccountbookDto accountbookDto) {
		
		String sql = "insert into accountbook()"
		
		
		
	}
	// 2. 호출	
	public ArrayList<AccountDto> aread() {
			
			
			
	}
		
	// 3. 수정	
	public boolean awrite(AccountbookDto accountbookDto) {
			
			
			
	}
		
	// 4. 삭제	
	public boolean awrite(AccountbookDto accountbookDto) {
			
			
			
	}
	
	
}// class e
