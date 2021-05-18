package chapter11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LprodDao1 {
	public List<LprodVO> select() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SJH", "java");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD ORDER BY 1");
		List<LprodVO> vo = new ArrayList<LprodVO>();
		int i = 0;
		while (resultSet.next()) {
			int lprodId = resultSet.getInt("LPROD_ID");
			String lprodGu = resultSet.getString("LPROD_GU");
			String lprodNm = resultSet.getString("LPROD_NM");
			vo.add(new LprodVO(lprodId, lprodGu, lprodNm));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}

	public void insert() throws Exception {

	}

	public void update() throws Exception {

	}

	public void delete() throws Exception {

	}
}
