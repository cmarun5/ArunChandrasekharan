package week6.day1.assignment3;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.sukgu.Shadow;
import week6.day1.ReadExcel;

public class ServiceNowBase {
		
		public RemoteWebDriver driver;
		public String fileName;
		@Parameters({"browser","url","username","password"})
		@BeforeMethod	
		public void preCondition(String browser, String url,String uname, String pwd) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
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