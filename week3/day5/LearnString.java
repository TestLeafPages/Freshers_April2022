package week3.day5;

public class LearnString {
public static void main(String[] args) {
	//String litteral
	String text1="welcome";
	text1="testleaf";
	System.out.println(text1);
	String text2="come";
	String concat = text1.concat(text2);
	System.out.println(concat);
	//==,.equal
	//using new keyword
	String value=new String("welcome");
	if(text1==text2) {
		System.out.println("both are equal");
	}else {
	System.out.println("both are not equal");
	}
	if(text1==value) {
		System.out.println("both are equal");
	}else {
	System.out.println("both are not equal");
	}
}
}
