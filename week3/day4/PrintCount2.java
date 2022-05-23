package week3.day4;

import java.util.Scanner;

public class PrintCount2 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	String nextLine = scan.nextLine();
	String[] split = nextLine.split(" ");
	System.out.println(split.length);
}
}
