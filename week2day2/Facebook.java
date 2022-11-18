package week1day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Haswanth");
		
		driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[@value=\"3\"]")).click();
		
		driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[@value=\"9\"]")).click();

		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[@value=\"1996\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
		
	

	}

}
