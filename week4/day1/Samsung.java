package week4.day1;

public class Samsung implements AndroidDesign ,SamsungDesign{

	@Override
	public void startPhone() {
		System.out.println("Start phone");
		
	}

	@Override
	public void makeCall() {
		System.out.println("make call");
		
	}

	//@Override
	public void sendSms() {
		System.out.println("Send Sms");
		
	}
	public void samsungNote() {
		System.out.println("Samsung Note");
	}

	
public static void main(String[] args) {
	Samsung obj=new Samsung();
	obj.startPhone();
	obj.makeCall();
	obj.sendSms();
	obj.samsungNote();
	
	
	
}

@Override
public void faceAuthendication() {
	System.out.println("Face Authendication");
	
}

@Override
public void samsungGalaxy() {
	System.out.println("samsung galaxy");
	
}

}
