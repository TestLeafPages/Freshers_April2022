package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
public static void main(String[] args) {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://www.leafground.com/pages/Window.html");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//getWindowHandle() --current window
		//getWindowHandles()-- child window
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(openWindow.get(1));
	
		  driver.findElement(By.xpath("//h5[text()='Edit']")).click(); // String
		 String title="TestLeaf - Interact with Edit Fields"; // 
		 String title2 = driver.getTitle(); 
		  if(title.equals(title2)) { 
		  System.out.println("Switched to another window"); 
		   }else { 
		  System.out.println("Controll not switched"); 
		  }
		  
		  driver.close();
		  driver.switchTo().window(parentWindow);
		  
		  
		  driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		  int size = driver.getWindowHandles().size();
		  
		 System.out.println("size"+size);
		
		
		
		
		
		
		
		
}
}
