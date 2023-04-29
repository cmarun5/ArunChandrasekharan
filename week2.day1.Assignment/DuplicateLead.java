package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter UserName & password Using id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
	    //click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter companyName field using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Business");
		//Enter FirstName field using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		//Enter LastName field using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrsekharan");
		//Enter FirstName (Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arun");
		//Enter Department field using any Locator of your choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Trainee-Testing");
		//Enter Description field using any Locator of your Choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NON IT to IT April 2023 Batch");
		//Enter email 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cmarun5@gmail.com");
		//create Submit
		driver.findElement(By.name("submitButton")).click();
		//Get Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//Clear company name 
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter new company 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Clear FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
	    // Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun C");
		//create Submit
		driver.findElement(By.name("submitButton")).click();
		//Get Title of Resulting Page
		String title1 = driver.getTitle();
		System.out.println(title1);
		
}
}
