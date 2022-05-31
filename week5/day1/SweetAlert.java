package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SweetAlert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	driver.switchTo().alert().accept();
}
}
