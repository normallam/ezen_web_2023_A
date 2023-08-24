package model.dao;

import model.dto.MemberDto;

public class MemberDao extends Dao{
	// 0. 싱글톤
	private static MemberDao MemberDao= new MemberDao();
	public static MemberDao getInstance() { return MemberDao; }
	private MemberDao() {}
	
	// 1. 회원가입
	public boolean signup(MemberDto dto) {
		
		try {
			String sql="insert into member(mid,mpwd,memail,mimg) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getMid());
			ps.setString(2, dto.getMpw());
			ps.setString(3, dto.getMemail());
			ps.setString(4, dto.getMimg());
			int row = ps.executeUpdate();
			if(row==1)return true;
		}catch(Exception e) {System.out.println(e);}	
		return false;
	}
	// 2. 이메일
	
	// 3. 아이디 찾기
	
	// 4. 비밀번호 찾기
	
	// 5. 내정보 호출
	
	// 6. 아이디 중복검사
	public boolean findId( String mid ) {
		try {
			String sql ="select * from member where mid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, mid);
			rs=ps.executeQuery();
			// [while : 결과 여러개 레코드 검사 vs if : 결과 레코드 한개 검사]
			if(rs.next()) return true;
			
		}catch(Exception e){System.out.println(e);
			
			
		}
		return false;
	}
	// 7. 회원수정
	
	// 8. 회원탈퇴
	
	
	
}
