package encapsulation;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseCard {

	public static void main(String[] args) {
		PersonalPayment payment=new PersonalPayment();
		
	payment.setCreditCardNumber("5555 5555 5555 5555");
		//System.out.println(payment.getCreditCardNumber());
		System.out.println(payment.getCreditCardNumber());
	}
}
