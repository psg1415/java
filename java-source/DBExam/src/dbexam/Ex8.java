package dbexam;

import java.sql.*;

public class Ex8 {
	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * 1. Class.forName("mysql 드라이버 - 패키지.클래스이름")
		 * 2. DB연결 DriverManager - getConnection -> Connection
		 * 3. SQL실행 - 실행을 위한 인스턴스
		 *    (Statement - Connection - createStatement(), 
		 *    PreparedStatement - Connection - prepareStament(String sql)
		 *    CallableStatement - Connection.prepareCall(String sql)
		 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "@sg960613";
		
		String sql = "CALL InsertBook(?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(url, user, password);
			CallableStatement cstmt = conn.prepareCall(sql)){
			cstmt.setInt(1, Integer.parseInt(args[0]));
			cstmt.setString(2, args[1]);
			cstmt.setString(3, args[2]);
			cstmt.setInt(4, Integer.parseInt(args[3]));
			int rs = cstmt.executeUpdate();
			System.out.println("affected rows : " + rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
