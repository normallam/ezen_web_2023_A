package model.dao;

import java.util.ArrayList;

import model.dto.VisitDto;

public class VisitDao extends Dao{

	// 0. 싱글톤
	private static VisitDao visitDao = new VisitDao();
	private VisitDao() {}
	public static VisitDao getInstance() {return visitDao;}
	
	// 1. 저장 [ 인수 : 저장할 내용이 담긴 DTO, 리턴 : 성공/실패(boolean) = true/false]
	public boolean vwrite(VisitDto visitDto) {
		
		try {
			// 1. SQL 작성
			String sql = "insert into visitlog(vname, vpw, vtext) values(?,?,?)";
			// 2. SQL 연결
			ps = conn.prepareStatement(sql);
			// 3. SQL 매개변수 대입
			ps.setString(1, visitDto.getVname());
			ps.setString(2, visitDto.getVpw());
			ps.setString(3, visitDto.getVtext());
			// 4. SQL 실행
			ps.executeUpdate();
			// 5. 결과 반환
			return true;

		}catch (Exception e) {System.out.println(e);}
	
		return false;}
	// 2. 호출 [ 인수 : x , 리턴 : 여러개(ArrayList)의 방문록DTO  = 모든 레코드 가져오기]
	public ArrayList<VisitDto> vread(){
		
		ArrayList<VisitDto> list = new ArrayList<>(); // 여러개 dto담을 리스트 객체
	
		try {
			String sql ="select * from visitlog order by vdate desc";
			ps= conn.prepareStatement(sql);
			rs = ps.executeQuery(); // S -> q , i/d/u - > u
			
			while(rs.next()) { // rs.next() : select 검색결과 중 다음 레코드 이동 => 존재하면 true/ 존재하지 않으면 false
				// * 레코드/한개의 줄/ 하나 행/ 하나 방문록 / 하나의 DTO 
				// 레코드 -> DTO 변환 (레코드마다 각 필드 호출 = rs.get타입(필드순번) vs rs.get타입("필드명"))
				VisitDto visitDto = new VisitDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				// ** 여러개 dto를 저장할 리스트에 저장
				list.add(visitDto);
			}
		}catch(Exception e) {System.out.println(e);  }
		return list;
	}
	// 3. 수정 [ 인수 : 수정할 번호(int)/수정할방문록내용(String)/비밀번호검토(String) , 리턴 : 성공/실패(boolean)=true/false]
	public boolean vupdate(int vno, String vtext, String vpw) {
		try {
			String sql = "update visitlog set vtext = ? where vno = ? and vpw = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(2, vno); ps.setString(1, vtext); ps.setString(3, vpw);
			int row = ps.executeUpdate();
			if(row==1) return true;
			return false;
		}catch(Exception e) {System.out.println(e);}
		
		
		
		
		return false;
		}
	// 4. 삭제 [ 인수 : 삭제할방문록번호,비밀번호검토(String) 리턴 : 성공/실패 true/ false]
	public boolean vdelete(int vno, String vpw) {
		try {
			String sql = "delete from visitlog where vno =? and vpw =?"; // 1.sql 작성
			ps= conn.prepareStatement(sql);	// 2. sql 연결
			ps.setInt(1, vno); ps.setString(2, vpw); // 3.sql 매개변수 대입
			int row = ps.executeUpdate();	// 4. sql 실행
			if(row==1) return true;
		}catch(Exception e) {System.out.println(e);}
	
		return false;
		}
}
