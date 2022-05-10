package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
private static WebElement findElement;

public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch the browser
	ChromeDriver driver=new ChromeDriver();
	//load tha application url
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	//maximize the browser
	driver.manage().window().maximize();
	
	
	//selectByValue
	//selectByIndex
	//selectByVisibleText
	//find the element in first dropdown
	//.WebElement eleDropDown1 = ;
	//using select class
	Select dd1=new Select(driver.findElement(By.id("dropdown1")));
	//dd1.selectByValue("3");
	
	//select using text
	//dd1.selectByVisibleText("Appium");
	
	//select using index
	//dd1.selectByIndex(1);
	
	driver.findElement(By.id("dropdown1")).sendKeys("Appium");
	
	
	
	
	
}
}
