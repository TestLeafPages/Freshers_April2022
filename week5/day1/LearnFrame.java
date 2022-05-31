package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("Click")).click();
	
	driver.switchTo().defaultContent();
	
	//driver.switchTo().frame(1);
	//driver.switchTo().parentFrame();
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("Click1")).click();
	
	
	WebElement ele = driver.findElement(By.id("Click1"));
	driver.switchTo().frame(ele);
	
	
	
}
}
