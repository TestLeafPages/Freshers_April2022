package week5.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);
	//driver.findElement(By.id("txtStationFrom")).
	
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU",Keys.ENTER);
	
	driver.findElement(By.id("tdDateOnly")).click();
	
	List<WebElement> rowCount = driver.
			findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
	int size = rowCount.size();
	for (int i = 1; i <= size; i++) {
		                                       ////table[@class='DataTable TrainList TrainListHeader']//tr[4]/td[2]
	String text = driver.
			findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	
	System.out.println(text);
	}
}
}
