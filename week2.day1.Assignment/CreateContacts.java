package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

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
		//Click contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//click create contacts
		driver.findElement(By.linkText("Create Contact")).click();
		//type FirstName
		driver.findElement(By.id("firstNameField")).sendKeys("Arun");
		//Type LastName
		driver.findElement(By.id("lastNameField")).sendKeys("Chandrasekharan");
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		//Print FirstName
		String FName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(FName);
		//Get Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		//close window
	    driver.close();
		
	}

}
