package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadXPath {

	public static void main(String[] args) {
		//Load driver
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//Enter UserName & password
		driver.findElement(By.xpath("//form[@id = 'login']//input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		//click on Login Button using 
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		//click on CRM/SFA Link
		driver.findElement(By.xpath("(//div[@id='form']//a)[2]")).click();
		//click on Leads button
		driver.findElement(By.xpath("(//ul[@class='sectionTabBar']//a)[2]")).click();
		//Click on Find Lead
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[3]")).click();
		//Enter firstName
		driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[2]")).sendKeys("Arun");
		//click Find Lead Button
		driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
		//click on first resulting lead
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10203'])[2]")).click();
		//title of page
		String title = driver.getTitle();
		System.out.println("The title of page :" +title);
		//Click edit
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[3]")).click();
		//change company name
		driver.findElement(By.xpath("(//form[@id='updateLeadForm']//input)[2]")).clear();
		driver.findElement(By.xpath("(//form[@id='updateLeadForm']//input)[2]")).sendKeys("qeagle");
		//Click update
		driver.findElement(By.xpath("//td[@colspan='4']//input")).click();
		//close the browser
		driver.close();



	}



}


