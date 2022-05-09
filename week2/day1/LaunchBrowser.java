package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	//ChromeDriver  driver=new ChromeDriver();
	//WebDriverManager.edgedriver().setup();
	//EdgeDriver driver=new EdgeDriver();
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
}
}

