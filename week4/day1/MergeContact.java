package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]")).click();
		 driver.findElement(By.linkText("Merge Contacts")).click();
		 
		 driver.findElement(By.xpath("//img[@src=\"/images/fieldlookup.gif\"]")).click();
		 String windowHandle= driver.getWindowHandle();
		 
		 Set<String> windowHandles=driver.getWindowHandles();
				 
		List<String> windows= new ArrayList<String>(windowHandles);
				 
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.linkText("13408")).click();
		
		//Clicking To widget
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("(//span[text()='To Contact']//following::img)[1]")).click();
				 
		
		
		driver.findElement(By.linkText("13410")).click();
		driver.findElement(By.id("ext-gen285")).click();
		
		driver.findElement(By.id("ext-gen620")).click();
		
		driver.findElement(By.xpath("//a[@id='ext-gen620']")).click();
		
		//driver.
		
		
		
		
		
		
		
		
		
		 
		 
	}

}
