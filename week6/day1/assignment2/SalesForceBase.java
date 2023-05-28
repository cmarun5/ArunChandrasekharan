package week6.day1.assignment2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.sukgu.Shadow;


public class SalesForceBase {
	public ChromeDriver driver;
	public ChromeDriverService options;
	@Parameters({"url","username","password"})
	@BeforeMethod	
		public void preCondition(String url, String uname,String pwd) throws IOException {
			driver = new ChromeDriver();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--enable-javascript");
			//ChromeDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname,Keys.TAB);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			driver.findElement(By.xpath("//span[text()='Learn More']")).click();
			
			Set<String> salesforces = driver.getWindowHandles();
			List<String> saleswindow =new ArrayList<String>(salesforces);
			driver.switchTo().window(saleswindow.get(1));
			
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			String title = driver.getTitle();
			System.out.println("Title of the page :" +title);
			
			Shadow shadow = new Shadow(driver);
			shadow.setImplicitWait(5);
			shadow.findElementByXPath("//span[text()='Learning']").click();
			
			WebElement trailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
			Actions builder = new Actions (driver);
			builder.moveToElement(trailhead).perform();
			
			
			WebElement scroll = shadow.findElementByXPath("//a[text()='Career Paths']");
	        Actions builder1=new Actions(driver);
	        builder1.scrollToElement(scroll).perform();
			
			WebElement certification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
			Actions builder2 =new Actions(driver);
			builder2.click(certification).perform();
			
			WebElement scrollto = driver.findElement(By.xpath("//h1[text()='Administrator Credentials']"));
			Actions builder3 = new Actions (driver);
			builder3.moveToElement(scrollto).perform();	
	
	}

	
	@AfterMethod
	public void postCondition() {
		driver.close();
}
	
}


