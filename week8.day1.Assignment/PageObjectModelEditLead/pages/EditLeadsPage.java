package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class EditLeadsPage extends ProjectSpecificMethod{
	public EditLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLeadsPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public EditLeadsPage inputPhoneNo(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		return this;
	}
	public EditLeadsPage clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public EditLeadsPage clickFirstLeads() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public EditLeadsPage clickEditLeads(){
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	public EditLeadsPage updateCName(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public VerifyUpdate clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new VerifyUpdate(driver);
	}

}
