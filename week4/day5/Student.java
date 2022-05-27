package week4.day5;

public class Student {
	static String text="Arun";
	/*
	 * static { System.out.println("static block"); } Student(){
	 * System.out.println("default constructor"); }
	 */
	public static void details() {
		System.out.println("details method");
	}
	
public static void main(String[] args) {
	Student std=new Student();
	System.out.println(text);
	details();
}
}
