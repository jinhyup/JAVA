package chapter11;

public class EmployeesVO {
	private int departmentId;
	private String departmentName;
	private String empName;
	public EmployeesVO(int departmentID, String departmentNAME, String empNAME) {
		this.departmentId = departmentID;
		this.departmentName = departmentNAME;
		this.empName = empNAME;
	}
	public int getDepartmentID() {
		return departmentId;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentId = departmentID;
	}
	public String getDepartmentNAME() {
		return departmentName;
	}
	public void setDepartmentNAME(String departmentNAME) {
		this.departmentName = departmentNAME;
	}
	public String getEmpNAME() {
		return empName;
	}
	public void setEmpNAME(String empNAME) {
		this.empName = empNAME;
	}
	
	@Override
	public String toString() {
		return "EmployeesVO [departmentID=" + departmentId + ", departmentNAME=" + departmentName + ", empNAME="
				+ empName + "]";
	}
	
	
	
}
