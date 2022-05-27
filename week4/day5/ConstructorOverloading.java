package week4.day5;

public class ConstructorOverloading {

	int empId;
	String empName;
	String empAddress;
	
	
ConstructorOverloading(){
	System.out.println("default constructor");
}
ConstructorOverloading(int id,String name,String address){
	//System.out.println("emp Id:"+id+" Emp name:"+name+" address:"+address);
	empId=id;
	empName=name;
	empAddress=address;
}
ConstructorOverloading(int id,String name){
	//System.out.println("emp Id:"+id+" Emp name:"+name+" address:"+address);
	empId=id;
	empName=name;
	//empAddress=address;
}

	
	public static void main(String[] args) {
		int a=10;
	//	Employee emp=new Employee();
		ConstructorOverloading emp=new ConstructorOverloading(10111, "Vignesh", "Chennai");
		
		  System.out.println(emp.empId);
		  System.out.println(emp.empName);
		  System.out.println(emp.empAddress);
		  ConstructorOverloading emp2=new ConstructorOverloading(10111, "Vignesh");
		  System.out.println(emp2.empId);
		  System.out.println(emp2.empName);
		 
		
			}
}
