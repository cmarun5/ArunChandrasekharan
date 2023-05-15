package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> salesforces = driver.getWindowHandles();
		List<String> saleswindow =new ArrayList<String>(salesforces);
		driver.switchTo().window(saleswindow.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page :" +title);
		
		Set<String> salesforces1 = driver.getWindowHandles();
		List<String> saleswindow1 =new ArrayList<String>(salesforces1);
		driver.switchTo().window(saleswindow1.get(0));
		String title1 = driver.getTitle();
		System.out.println("Title of the page :" +title1);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
