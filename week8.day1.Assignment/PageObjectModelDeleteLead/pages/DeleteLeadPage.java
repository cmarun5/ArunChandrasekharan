package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;


public class DeleteLeadPage extends ProjectSpecificMethod {
	public static String leadId;
	public DeleteLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public DeleteLeadPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public DeleteLeadPage inputPhoneNum(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		return this;
	}
	public DeleteLeadPage clickFindLeadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DeleteLeadPage getTextOfFirstLead() {
		@SuppressWarnings("unused")
		DeleteLeadPage input = new DeleteLeadPage(driver);
		leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		return this;
	}
	public DeleteLeadPage clickFirstResLead() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public VerifyDeleteLead clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new VerifyDeleteLead(driver);
	}
	
	
}
