package week1.day2;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=1234567898345672L;
	boolean isPunctured=false;
	String bikeName="Ktm";
	double runningKM=298734.87634;

	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();

		System.out.println(two.noOfWheels);
		System.out.println("noOfMirrors "+two.noOfMirrors);
		System.out.println("chassisNumber "+two.chassisNumber);
		System.out.println("isPunctured "+two.isPunctured);
		System.out.println("bikeName "+two.bikeName);
		System.out.println("runningKM "+two.runningKM);
	}
}
