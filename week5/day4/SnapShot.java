package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapShot {
public static void main(String[] args) throws IOException {
	//download the driver and set the path
			WebDriverManager.chromedriver().setup();
			//launch the browser
			ChromeDriver driver=new ChromeDriver();
			//load the application url
			driver.get("http://www.leafground.com/pages/Window.html");
			//maximize the browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement ele = driver.findElement(By.id("home"));
			
//			File source = ele.getScreenshotAs(OutputType.FILE);
//			File destination =new File("./snap/img.png");
//			FileUtils.copyFile(source, destination);
//			
			
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./data/image.png");
			FileUtils.copyFile(screenshotAs, dest);
			
			
		
			
}
}
