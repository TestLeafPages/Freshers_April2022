package week5.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {
public static void main(String[] args) {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("TestLeaf");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		
}
}
