package chapter11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SJH", "java");
		
		//3. 질의 명령 준비
		Statement statement = connection.createStatement();
//		statement.execute("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
		
		//4. 명령 실행(질의 결과 수집)
		ResultSet resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
		
//		//참고 : insert, update, delete
//		int executeUpdate = statement.executeUpdate("");
		System.out.println("lprod_id\tlprod_gu\tlprod_nm");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("LPROD_ID") + "\t" + "\t");
			System.out.print(resultSet.getString("LPROD_GU") + "\t" + "\t");
			System.out.print(resultSet.getString("LPROD_NM") + "\n");
		}
		
		// 5. 종료(자원 반납)
		resultSet.close();
		statement.close();
		connection.close();
	}

}
