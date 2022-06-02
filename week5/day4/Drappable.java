package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drappable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	//launch the browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("http://www.leafground.com/pages/drop.html");
	//maximize the browser
	driver.manage().window().maximize();
	
	
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	Actions builder=new Actions(driver);
	builder.dragAndDrop(from, to).perform();
	
	
	
}
}
