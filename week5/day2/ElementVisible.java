package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisible {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch the browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("http://www.leafground.com/pages/appear.html");
	//maximize the browser
	driver.manage().window().maximize();
	
	WebElement ele = driver.findElement(By.id("btn"));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
	
	wait.until(ExpectedConditions.visibilityOf(ele));
	
	System.out.println(ele.isDisplayed());
	
	
	
	
	
	
	
	
	
	
}
}
