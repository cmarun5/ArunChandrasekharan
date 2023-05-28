package week6.day1.assignment1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;
import week6.day1.ReadExcel;

public class ServiceNowBase {
		
		public ChromeDriver driver;
		public String fileName;
		@Parameters({"url","username","password","incidents",})
		@BeforeMethod	
		public void preCondition(String url, String uname, String pwd, String inci) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
			Shadow shadow = new Shadow(driver);
			shadow.setImplicitWait(10);
			WebElement all = shadow.findElementByXPath("//div[contains(@class,'sn-polaris-navigation polaris-header-menu')]/div[text()='All']");
			Actions builder = new Actions (driver);
			builder.moveToElement(all).perform();
			Actions builder2=new Actions(driver);
			builder2.click(all).perform();
			shadow.findElementByXPath("//input[@id='filter']").sendKeys(inci);
			shadow.findElementByXPath("//mark[text()='Incidents']").click();
		}
		@DataProvider
	    public String[][] testData() throws IOException {
	        String[][] readData = ReadExcel.readData(fileName);
	        return readData;
		}
		@AfterMethod
		public void postCondition() {
			driver.close();
	}
}