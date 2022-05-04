package week1.day3;

public class Mobile {

	public void sendMessage(){
		System.out.println("Send Message");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
	public void call() {
		System.out.println("Call");
	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendMessage();
		mob.shareDocument();
		mob.call();
	}
}
