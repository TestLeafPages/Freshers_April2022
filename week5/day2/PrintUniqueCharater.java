package week5.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharater {
	public static void main(String[] args) {
		String text="AMAZON";
		char[] charArray = text.toCharArray();
		Set<Character> value=new LinkedHashSet<Character>();
		/*
		 * for (Character character : charArray) { value.add(character); }
		 * System.out.println(value);
		 */
		for (int i = 0; i < charArray.length; i++) {
			value.add(charArray[i]);
		}
		System.out.println(value);
		
		
		
	}

}
