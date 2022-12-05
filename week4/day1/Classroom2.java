package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		 ChromeDriver driver=new ChromeDriver(options); 
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("FLIGHTS")).click();
		 
		String windowHandle= driver.getWindowHandle();
		 
	Set<String> windowHandles=driver.getWindowHandles();
		 
		List<String> windows= new ArrayList<String>(windowHandles);
		 
	driver.switchTo().window(windows.get(0));
	System.out.println(driver.getTitle());
		driver.close();
		 
		 
		 
		 
		
		 
		 


	}

}
