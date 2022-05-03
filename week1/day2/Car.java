package week1.day2;

public class Car {

	public void driveCar() {
		System.out.println("Drive Car");
	}
	
	public  void applyBreak() {
		
		System.out.println("Apply Break");
	}
	
	public  void switchOnAc() {
		System.out.println("Switch on Airconditioner");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.driveCar();
		car.applyBreak();
		car.switchOnAc();
	}
}
