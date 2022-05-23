package week3.day4;

import java.util.Scanner;

public class PrintNumber {
public static void main(String[] args) {
	/*
	 * String text="Amazon has more than 17,865 employees in chennai";
	 * 
	 * String text1="testleaf";
	 */
	Scanner scan =new Scanner(System.in);
	
	//System.out.println("enter the word");
	String nextLine = scan.nextLine();
	
	System.out.println(nextLine);
	String[] split = nextLine.split(" ");
	int length = split.length;
	System.out.println(length);
	
	
	
	
	
	
	
	
}
}
