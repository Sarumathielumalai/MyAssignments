package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		 driver.manage().window().maximize();

		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 driver.findElement(By.xpath("//span[text()='Open']/parent::button"));
		 
		 
		 
		

	}

}
