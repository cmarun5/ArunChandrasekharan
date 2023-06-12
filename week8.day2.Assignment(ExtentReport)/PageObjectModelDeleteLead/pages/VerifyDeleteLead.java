package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class VerifyDeleteLead extends ProjectSpecificMethod{
	public VerifyDeleteLead (ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public VerifyDeleteLead clickFindLeadButton() throws IOException {
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Find leads button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Find leads button is not clicked successfully","fail");
		}
		return this;
	}
	@SuppressWarnings("static-access")
	public VerifyDeleteLead searchForDeletedLead() throws InterruptedException, IOException {
		DeleteLeadPage input = new DeleteLeadPage(driver,node);
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(input.leadId);
			reportStep("Lead to be deleted is searched","pass");
		} catch (Exception e) {
			reportStep("Lead to be deleted is not searched","fail");
		}
		return this;
	}
	public VerifyDeleteLead clickFindLeads() throws IOException {
		try {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Find Leads button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Find Leads button is not clicked successfully","fail");
		}
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
