package week1.day2;

public class Caluculator {

	public void add(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Caluculator calc=new Caluculator();
		 calc.add(20, 20);
		calc.sub(25, 5);
	}
	
}