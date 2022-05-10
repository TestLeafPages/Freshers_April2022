package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//find username and type value in textbox
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//find password and type value in textbox
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click login button
	driver.findElement(By.className("decorativeSubmit123")).click();
}
}
