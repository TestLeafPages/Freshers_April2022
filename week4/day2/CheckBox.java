package weel4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	
	List<WebElement> ele = driver.findElements(By.xpath("//label[contains(text(),'below checkboxes')]/following-sibling::input"));
	for (int i = 0; i < ele.size(); i++) {
		 ele.get(i).click();
	}
	
	
	
	
}
}
