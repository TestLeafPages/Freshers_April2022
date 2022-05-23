package week3.day5;

public class LearnStringBuffer {
public static void main(String[] args) {
	String text="testleaf";
//	char[] charArray = text.toCharArray();
//	int length = charArray.length;
//	for (int i =charArray.length-1;i>=0;i--) {
//		System.out.print(charArray[i]);
//	}
	
	
	StringBuffer  buffer=new StringBuffer("Akash");
	
	buffer.append("pandian");
	
	System.out.println(buffer);
	
	StringBuffer rev=new StringBuffer("testleaf");
	StringBuffer reverse = rev.reverse();
	System.out.println(reverse);
	
	
	
	
	
}
}
