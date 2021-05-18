package chapter11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class EmployeeDAO {
	public List<EmployeesVO> selectEmployeeList() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SJH", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT A.DEPARTMENT_ID AS 부서코드");
		builder.append("A.DEPARTMENT_NAME AS 부서명");
		builder.append("B.EMP_NAME AS 관리사원명");
		builder.append("FROM HR.DEPARTMENTS A , HR.EMPLOYEES B");
		builder.append("WHERE A.MANAGER_ID = B.EMPLOYEE_ID ");
		builder.append("AND A.DEPARTMENT_ID = ANY(SELECT DEPARTMENT_ID");
		builder.append("FROM HR.JOB_HISTORY);");
		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		ResultSet resultSet = statement.executeQuery(builder.toString());
		while (resultSet.next()) {
			int departmentId = resultSet.getInt("DEPARTMENT_ID");
			String departmentName = resultSet.getString("DEPARTMENT_NAME");
			String empName = resultSet.getString("EMP_NAME");
			list.add(new EmployeesVO(departmentId, departmentName, empName));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	public EmployeesVO selectEmployee() {
		return null;
	}
	public EmployeesVO insertEmployee() {
		return null;
	}
	public EmployeesVO updateEmployee() {
		return null;
	}
	public EmployeesVO deleteEmployee() {
		return null;
	}
}

