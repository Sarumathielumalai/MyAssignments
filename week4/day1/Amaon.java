package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amaon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();

		 WebElement obj=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		 obj.sendKeys("oneplus 9 pro");
		 obj.sendKeys(Keys.ENTER);
		 
		 WebElement obj1=driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"]/ancestor::span)[2]"));
		 System.out.println(obj1.getText());
		// WebElement obj2=driver.findElement(By.xpath("//div[@class=\"a-row a-size-small\"]//a//span"));
		// System.out.println(obj2.getText());
		 
		 driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
		 
		Set<String> windowHandle=driver.getWindowHandles();
		 List<String>it=new ArrayList<String>(windowHandle);
		 driver.switchTo().window(it.get(1));
		 System.out.println(driver.getCurrentUrl());
		 
		 
		 WebElement ele=driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51TSWESN39S._SX679_.jpg']"));
		 File source=ele.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./snaps/product.png");
		 FileUtils.copyFile(source, dest);
		 
		 
		 
		 
		 
		 
		 
	}

}
