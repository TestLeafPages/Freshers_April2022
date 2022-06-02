package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	//Action interface
	//Actions Class
	
	WebElement ele = driver.findElement(By.id("draggable"));
	Actions builder=new Actions(driver);
	//builder.dragAndDropBy(ele, 100, 100).perform();
	//builder.dragAndDrop(ele, ele)
}
}
