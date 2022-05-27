package week4.day5;

public class LearnStatic {
	String empName;
	int empId;
	static String empCompany;
	public void getEmployeeDetails(String name,int id,String company) {
		empName=name;
		empId=id;
		empCompany=company;
	}
	
public static void main(String[] args) {
	LearnStatic emp=new LearnStatic();
	emp.getEmployeeDetails("Prakash", 1011,"HCL");
	
	
	LearnStatic emp2=new LearnStatic();
	emp2.getEmployeeDetails("Vel", 1012,"Testleaf");
	
	LearnStatic emp3=new LearnStatic();
	emp3.getEmployeeDetails("RajBabu", 1013,"TCS");
	
	System.out.println(emp.empName+" "+emp.empId+" "+emp.empCompany);
	System.out.println(emp2.empName+" "+emp2.empId+" "+emp2.empCompany);
	System.out.println(emp3.empName+" "+emp3.empId+" "+emp3.empCompany);
	
	
	
}
}
