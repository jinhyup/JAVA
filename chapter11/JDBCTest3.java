package chapter11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// 1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.DB 접속
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SJH", "java");

			// 3. 질의 명령 준비
			// statement.execute("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
			statement = connection.createStatement();

			// 4. 명령 실행(질의 결과 수집)
			resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");

			// //참고 : insert, update, delete
			// int executeUpdate = statement.executeUpdate("");
			System.out.println("lprod_id\tlprod_gu\tlprod_nm");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("LPROD_ID") + "\t" + "\t");
				System.out.print(resultSet.getString("LPROD_GU") + "\t" + "\t");
				System.out.print(resultSet.getString("LPROD_NM") + "\n");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5. 종료(자원 반납)
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
