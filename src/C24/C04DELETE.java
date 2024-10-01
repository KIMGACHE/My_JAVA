package C24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C04DELETE {

	public static void main(String[] args) {
		// JDBC 프로그래밍
		// 자바와 DBMS를 연결해주는 여러가지 클래스
		// 그럴려면 Driver 클래스가 필요하다. 각 DBMS마다 Driver클래스가 다르다.
		// JDBC프로그래밍 단계
		// JDBC 드라이버 로드 - 데이터베이스 연결 - Statement(SQL문) 생성 - SQL문 전송 - 결과받기 - 연결해제
		// mysql 드라이버 다운로드 -> mysql community download검색 -> Connector/j -> platform independent -> zip파일 -> no thanks
		// 압축을 푼 폴더에서 .jar파일을 해당 폴더로 넣고 라이브러리 추가
		
		
		
		// DB CONN DATA
		String id = "root"; // 내 db이름
		String pw = "1234"; // 내 db비밀번호
		String url = "jdbc:mysql://localhost:3306/testdb"; // 내 db경로인듯
		
		// JDBC 참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// testdb가 없으면 workbench에서 만들면 됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 메모리공간에 드라이버를 적재?
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url, id, pw); // DB연결정보를 이용해서 연결이 완료되면 connection객체를 만든다. 그 객체를 conn에 연결
			System.out.println("DB Connected...");
			
			pstmt = conn.prepareStatement("delete from tbl_std where name=? and age=? and addr=?"); // 미리 statement를 만들어놓고 전송, 부하가 적음, 변수는 ?로 처리한다.
			pstmt.setString(1, "홍길동"); // 첫번째 파라미터는 ?,?,?에 들어가는 변수의 인덱스를 적는다, 두번째 파라미터는 해당 인덱스의 변수에 들어갈 값을 적는다.
			pstmt.setInt(2, 22); // 각 변수의 타입을 확인하여 메서드를 사용해야한다.
			pstmt.setString(3, "대구");
			
			
			int result = pstmt.executeUpdate(); // DML(INSERT,UPDATE,DELETE) 문장 실행, (문제가 있다면 0 return)
			
			if(result>0)
				System.out.println("Delete 성공");
			else
				System.out.println("Delete 실패");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
