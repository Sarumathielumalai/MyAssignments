package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sarumathi");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elumalai");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saru");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Started coding selenium");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Saru@gmail.com");
		 WebElement ele=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd=new Select(ele);
		 dd.selectByVisibleText("Alaska");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 
		 
		 
		 
	}

}
