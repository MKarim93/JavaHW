package week2HW;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Adam McKay");
		emp1.setEmpID(123);
		emp1.setEmpSalary(20000);
		System.out.println("Employee 1's name, ID and salary is"+" "+emp1.getEmpName()+" "+emp1.getEmpID()+" "+emp1.getEmpSalary());
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Eminem");
		emp2.setEmpID(124);
		emp2.setEmpSalary(50000);
		System.out.println("Employee 2's name, ID and salary is"+" "+emp2.getEmpName()+" "+emp2.getEmpID()+" "+emp2.getEmpSalary());
		
		Employee emp3 = new Employee();
		emp3.setEmpName("Night Wing");
		emp3.setEmpID(125);
		emp3.setEmpSalary(60000);
		System.out.println("Employee 3's name, ID and salary is"+" "+emp3.getEmpName()+" "+emp3.getEmpID()+" "+emp3.getEmpSalary());
	}

}
