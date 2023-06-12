package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	public DuplicateLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public DuplicateLeadPage clickPhone() throws IOException {
		try {
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			reportStep("Phone tab is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Phone tab is not clicked successfully","fail");
		}
		return this;
	}
	public DuplicateLeadPage inputPhoneNo(String pnum) throws IOException {
		try {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
			reportStep("Phone number is entered successfully","pass");
		} catch (Exception e) {
			reportStep("Phone number is not entered successfully","fail");
		}
		return this;
	}
	public DuplicateLeadPage clickFindLeads() throws IOException {
		try {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Find Leads is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Find Leads is not clicked successfully","fail");
		}
		return this;
	}
	public DuplicateLeadPage clickFirstLeads() throws InterruptedException, IOException {
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			reportStep("First Leads is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("First Leads is not  clicked successfully","fail");
		}
		return this;
	}
	public DuplicateLeadPage clickDuplicateLead() throws IOException {
		try {
			driver.findElement(By.linkText("Duplicate Lead")).click();
			reportStep("Duplicate Lead is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Duplicate Lead is not clicked successfully","fail");
		}
		return this;
	}
	public VerifyDuplicateLead clickCreateLeads() throws IOException {
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("Submit Button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Submit Button is not clicked successfully","fail");
		}
		return new VerifyDuplicateLead(driver,node);
	}
}
