package week4.day1;

public class MyMobile {
public static void main(String[] args) {
	
      //AndroidDesign design=new AndroidDesign();
	
	Samsung sam =new  Samsung();
	sam.startPhone();
	sam.makeCall();
	sam.faceAuthendication();
	sam.samsungGalaxy();
	sam.samsungNote();
	sam.sendSms();
	
	AndroidDesign design=new Samsung();
	
	design.startPhone();
	design.makeCall();
	
	SamsungDesign obj=new Samsung();
	obj.faceAuthendication();
	obj.samsungGalaxy();
	
}
}
