package model.dao;

import java.util.ArrayList;

import model.dto.HrmDto;

public class HrmDao extends Dao{

	private static HrmDao HrmDao= new HrmDao();
	public static HrmDao getInstance() { return HrmDao; }
	private HrmDao () {}

	// 1. 직원등록(회원가입)
	public boolean regist(HrmDto dto) {
		try {
			String sql = "insert into hrm( epi , ename , ecall , egrade, eredate ) values( ? , ? , ? , ? , ?)";
			ps= conn.prepareStatement(sql);
			ps.setString(1, dto.getEpi());
			ps.setString(2, dto.getEname());
			ps.setString(3, dto.getEcall());
			ps.setString(4, dto.getEgrade());
			ps.setString(5, dto.getEredate());
			int row = ps.executeUpdate();
			if(row==1)return true;
			
		}catch(Exception e) {System.out.println(e);}
		return false;

	}
	// 2. 출력하기
	public ArrayList<HrmDto> view(){
		ArrayList<HrmDto> list = new ArrayList<>();
		
		try {
			String sql = "select * from hrm order by eno desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				HrmDto hrmDto = new HrmDto(
						rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6));
				list.add(hrmDto);
			}System.out.println(list);
			
		} catch (Exception e) {System.out.println(e);
			return list;
		}
		return null;
		
		
	}















} // class e
