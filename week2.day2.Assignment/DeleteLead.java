package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//Enter UserName & password Using id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
	    //click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name ='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name ='phoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@name ='phoneAreaCode']")).sendKeys("044");
		driver.findElement(By.xpath("//input[@name ='phoneNumber']")).sendKeys("9791110077");
		//click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//capture Lead Id
		String getText = driver.findElement(By.xpath("//a[text()='10201']")).getText();
		System.out.println(getText);
		//click first resulting lead
		driver.findElement(By.xpath("//a[text()='10201']")).click();
		//click Delete
		//driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click on Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		//enter Captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10201");
		//click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//verify message
		driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(getText);
		//close Browser
		driver.close();			
	}

}
