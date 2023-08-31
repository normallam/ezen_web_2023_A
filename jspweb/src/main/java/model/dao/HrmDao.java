package model.dao;

import model.dto.HrmDto;

public class HrmDao extends Dao{

	private static HrmDao HrmDao= new HrmDao();
	public static HrmDao getInstance() { return HrmDao; }
	private HrmDao () {}

	// 1. 직원등록
	public boolean regist(HrmDto dto) {
		try {
			String sql = "insert into hrm( epi , ename , ecall , egrade ) values( ? , ? , ? , ? )";
			ps= conn.prepareStatement(sql);
			ps.setString(1, dto.getEpi());
			ps.setString(2, dto.getEname());
			ps.setString(3, dto.getEcall());
			ps.setString(4, dto.getEgrade());
			int row = ps.executeUpdate();
			if(row==1)return true;
			
		}catch(Exception e) {System.out.println(e);}
		return false;

	}
	// 2. 















} // class e
