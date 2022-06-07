package encapsulation;

public class GreatestOfThreeNumbers {
public static void main(String[] args) {
	int a=7;
	int b=2;
	int c=10;
	if(a>b &&a>c) {
		System.out.println("a is Greater"+a);
	}
	else if (b>c&&b>a) {
		System.out.println("b is Greater"+b);
		
	}
	else {
		System.out.println("c is greater"+c);
	}
}
}
