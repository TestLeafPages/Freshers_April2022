package week1.day1;

public class Computer {

	String computerName="dell";
	char firstLetter='D';
	short ramSize=8;
	int memory=256;
	boolean isDamaged=true;
	double price=29887.87654442;
	float frequencyRange=2.54f;
	long ipAddress=2345678752275244L;
	public static void main(String[] args) {
		Computer object=new Computer();
		
		System.out.println( object.computerName);
	}

}
