package accountbook.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	// 1. 필드
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	
	// 2. 생성자
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb", "root","1234");
			
			
		}catch(Exception e) {System.out.println(e);}
		
		
	}
	
}
