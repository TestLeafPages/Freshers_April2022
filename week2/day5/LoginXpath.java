package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginXpath {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demomsalesmanager");
	driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
}
}
