package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		//Enter firstName
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Arun");
		//click Find Lead Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//click on first resulting lead
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10201'])[2]")).click();
		//title of page
		String title = driver.getTitle();
		System.out.println("The title of page :" +title);
		//Click edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		//change company name
		driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).sendKeys("qeagle");
		//Click update
		driver.findElement(By.name("submitButton")).click();
		//close the browser
		driver.close();
		
		

	}

}
