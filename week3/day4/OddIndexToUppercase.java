package week3.day4;

public class OddIndexToUppercase {
public static void main(String[] args) {
	String text="testleaf";//tEsTlEaF
	char[] charArray = text.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(i%2!=0) {
			char upperCase = Character.toUpperCase(charArray[i]);
			System.out.print(upperCase);
		}else {
			System.out.print(charArray[i]);
		}
	}
}
}
