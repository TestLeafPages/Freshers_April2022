package week1.day3;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee name: "+empName+" "+"Emp id:  "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee address:"+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee salary:"+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Employee Name:"+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Kani", 101);
		employee.getEmployeeAddress("Chennai");
		employee.printEmployeeSalary(3000.8682362);
		employee.printEmployeeMobileNumber(9776886875435435L);
		
		
		
	}
}
