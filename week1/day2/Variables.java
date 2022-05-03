package week1.day2;

public class Variables {

	String text;
	char c;
	boolean isVariables;
	double value;
	
	public void add() {
		int a = 0;
		System.out.println(a);
		int b=4;
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Variables var=new Variables();
		System.out.println(var.text);
		System.out.println(var.c);
		System.out.println(var.isVariables);
		System.out.println(var.value);
		var.add();
	}
	}
