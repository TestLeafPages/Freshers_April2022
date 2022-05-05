package week1.day4;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range=8;
		int first =0;

		// Print first number
		System.out.println(first);
		//initialize second number
		int second=1;
		//print second number
		System.out.println(second);
		// Iterate from 1 to the range
		for (int i = 1; i <=range; i++) {


			// add first and second number assign to sum
			int sum=first+second;
			//print sum
			System.out.println(sum);
			// Assign second number to the first number
   first=second;
			// Assign sum to the second number
  second=sum;
			// print sum

		}
	}

	}
