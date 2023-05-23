package week5.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class ServiceNowBase {
		
		public ChromeDriver driver;
		@BeforeMethod	
		public void preCondition() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dev139543.service-now.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("@Run$ekharan21");
			driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
			Shadow shadow = new Shadow(driver);
			shadow.setImplicitWait(10);
			WebElement all = shadow.findElementByXPath("//div[contains(@class,'sn-polaris-navigation polaris-header-menu')]/div[text()='All']");
			Actions builder = new Actions (driver);
			builder.moveToElement(all).perform();
			Actions builder2=new Actions(driver);
			builder2.click(all).perform();
			
		}
		@AfterMethod
		public void postCondition() {
			driver.close();
	}
}