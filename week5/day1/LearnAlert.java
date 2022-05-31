package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Thread.sleep(2000);
	TargetLocator switchTo = driver.switchTo();
	switchTo.alert().accept();
	 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	 Thread.sleep(2000);
	 Alert confirmAlert = driver.switchTo().alert();
	 String text = confirmAlert.getText();
	 System.out.println(text);
	 confirmAlert.accept();
	 
	 driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	 Thread.sleep(2000);
	 Alert promptAlert = driver.switchTo().alert();
	 promptAlert.sendKeys("Automation");
	 promptAlert.accept();
}
}
