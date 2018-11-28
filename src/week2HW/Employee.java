package week2HW;

public class Employee {
	
	public static String empName;
	int empID;
	int empSalary;
	String empDept;
	
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary; 
	}
	
	public int getEmpSalary() {
		return empSalary;
	}
	
	public static void setEmpName(String empName) {
		
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public int getEmpID() {
		return empID;
	}
}
