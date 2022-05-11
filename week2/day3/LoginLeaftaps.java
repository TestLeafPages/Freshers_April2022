package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch tha chrome browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	//enter the username as demosalesmanager
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	//enter the password as crmsfa
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	//click the login button 
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	
	
	
	
	
	
	
	
	
	
}
}
