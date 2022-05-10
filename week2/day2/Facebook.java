package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Aravind");
	driver.findElement(By.name("lastname")).sendKeys("RK");
	driver.findElement(By.name("reg_email__")).sendKeys("aravindraman440@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("123456");
	WebElement date = driver.findElement(By.id("day"));
	Select day=new Select(date);
	day.selectByVisibleText("20");
	
	
	
	
}
}
