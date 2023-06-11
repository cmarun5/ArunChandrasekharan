package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class VerifyDeleteLead extends ProjectSpecificMethod{
	public VerifyDeleteLead (ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyDeleteLead clickFindLeadButton() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	@SuppressWarnings("static-access")
	public VerifyDeleteLead searchForDeletedLead() throws InterruptedException {
		DeleteLeadPage input = new DeleteLeadPage(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(input.leadId);
		return this;
	}
	public VerifyDeleteLead clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public VerifyDeleteLead verifyDelete() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Leads Deleted");
		} else {
			System.out.println("Leads not Deleted");
		}
		return this;
	}
}
