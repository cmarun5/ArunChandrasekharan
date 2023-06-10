package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public DuplicateLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public DuplicateLeadPage inputPhoneNo(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		return this;
	}
	public DuplicateLeadPage clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DuplicateLeadPage clickFirstLeads() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return this;
	}
	public VerifyDuplicateLead clickCreateLeads() {
		driver.findElement(By.name("submitButton")).click();
		return new VerifyDuplicateLead(driver);
	}
}
