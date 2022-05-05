package week1.day4;

public class Mobile {

	public void sendMessage() {
		System.out.println("send Message");
	}
	private void audioCall() {
		System.out.println("Audio call");
	}
	protected void videoCall() {
		System.out.println("Video call");
	}
	  void shareDocument() {
		System.out.println("Share document");
	}
	 public static void main(String[] args) {
		 Mobile mob =new Mobile();
		 mob.audioCall();
		 mob.videoCall();
		 mob.sendMessage();
		 mob.shareDocument();
	}
	 
}
