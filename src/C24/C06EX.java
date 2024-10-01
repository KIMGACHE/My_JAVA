package C24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06EX {

	public static void main(String[] args) {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
				
		// JDBC 참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 메모리공간에 드라이버를 적재?
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url, id, pw); // DB연결정보를 이용해서 연결이 완료되면 connection객체를 만든다. 그 객체를 conn에 연결
			System.out.println("DB Connected...");
			
//			pstmt = conn.prepareStatement("insert into tbl_sample values(?,?,?,?,?,?)"); // 미리 statement를 만들어놓고 전송, 부하가 적음, 변수는 ?로 처리한다.
//			pstmt.setInt(1, 199); // 각 변수의 타입을 확인하여 메서드를 사용해야한다.
//			pstmt.setString(2, "경남 밀양");
//			pstmt.setString(3, "경상남도지사");
//			pstmt.setString(4, "밀양 가스관리공단");
//			pstmt.setInt(5, 22556);
//			pstmt.setString(6, "경남 밀양시 교동 3265");
//			
//			
//			int result = pstmt.executeUpdate(); // DML(INSERT,UPDATE,DELETE) 문장 실행, (문제가 있다면 0 return)
//			
//			if(result>0)
//				System.out.println("Insert 성공");
//			else
//				System.out.println("Insert 실패");
			
//			pstmt = conn.prepareStatement("update tbl_sample set 주소=? where 우편번호=?");
//			pstmt.setString(1, "경남 밀양시 하남읍 대사 2안길");
//			pstmt.setInt(2, 22556);
//			
//			int result = pstmt.executeUpdate();
//			
//			if(result > 0)
//				System.out.println("Update 성공");
//			else
//				System.out.println("Update 실패");
			
//			pstmt = conn.prepareStatement("delete from tbl_sample where 순번=? and 우편번호=?");
//			pstmt.setInt(1, 199);
//			pstmt.setInt(2, 22556);
//			
//			int result = pstmt.executeUpdate();
//			if(result > 0)
//				System.out.println("Delete 성공");
//			else
//				System.out.println("Delete 실패");
			
			pstmt = conn.prepareStatement("select * from tbl_sample");
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					System.out.print(rs.getInt(1)+" ");
					System.out.print(rs.getString(2)+" ");
					System.out.print(rs.getString(3)+" ");
					System.out.print(rs.getString(4)+" ");
					System.out.print(rs.getInt(5)+" ");
					System.out.print(rs.getString(6));
					System.out.println();
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
