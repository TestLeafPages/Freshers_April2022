package week1.day4;

public class PrimeNumber {
	// Declare an int Input and assign a value 13
public static void main(String[] args) {
	int input=19;

	boolean flag=false;
	for (int i = 2; i <=input -1; i++) {
		//       2 -----18
		if(input%i==0) {
			flag=true;
			System.out.println("not prime");
			break;
		}
	}
	if(!flag) {
		System.out.println("Given number is Prime");
	}else {
		System.out.println("Given number is Prime");
	}

}
	
}
