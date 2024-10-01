package C24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C06EX_Teacher {
	// DB CONN DATA
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/testdb";
			
	// JDBC 참조변수
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
			
	public static void Connect() throws Exception {
		// DB연결
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url, id, pw); // connection객체를 만든다.
		System.out.println("DB Connected...");
	}
	public static void Select() throws Exception {
		// 조회
		pstmt = conn.prepareStatement("select * from tbl_sample");
		rs = pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.println();
			}
		}
		
		freeConnection(pstmt,rs);
	}
	public static void Insert() throws Exception {}
	public static void Update() throws Exception {}
	public static void Delete() throws Exception {}
	//자원제거용 함수 오버로딩
	public static void freeConnection(Connection conn) throws Exception {}
	public static void freeConnection(PreparedStatement pstmt) throws Exception {}
	public static void freeConnection(PreparedStatement pstmt, ResultSet rs) throws Exception {
		pstmt.close();
		rs.close();
	}
	
	public static void main(String[] args) {
		try {
			Connect();
			Select();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
