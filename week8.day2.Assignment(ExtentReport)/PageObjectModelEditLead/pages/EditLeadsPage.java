package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class EditLeadsPage extends ProjectSpecificMethod{
	public EditLeadsPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;	
		}
	public EditLeadsPage clickPhone() throws IOException {
		try {
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			reportStep("Phone tab is clicked","pass");
		} catch (Exception e) {
			reportStep("Phone tab is not clicked","fail");
		}
		return this;
	}
	public EditLeadsPage inputPhoneNo(String pnum) throws IOException {
		try {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
			reportStep("Phone Number is entered","pass");
		} catch (Exception e) {
			reportStep("Phone Number is entered","fail");
		}
		return this;
	}
	public EditLeadsPage clickFindLeads() throws IOException {
		try {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Find Leads button is clicked","pass");
		} catch (Exception e) {
			reportStep("Find Leads button is not clicked","fail");
		}
		return this;
	}
	public EditLeadsPage clickFirstLeads() throws InterruptedException, IOException {
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			reportStep("First Leads is clicked","pass");
		} catch (Exception e) {
			reportStep("First Leads is not clicked","fail");
		}
		return this;
	}
	public EditLeadsPage clickEditLeads() throws IOException{
		try {
			driver.findElement(By.linkText("Edit")).click();
			reportStep("Edit Leads button is clicked","pass");
		} catch (Exception e) {
			reportStep("Edit Leads button is not clicked","fail");
		}
		return this;
	}
	public EditLeadsPage updateCName(String cname) throws IOException {
		try {
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
			reportStep("Company name is updated","pass");
		} catch (Exception e) {
			reportStep("Company name is not updated","fail");
		}
		return this;
	}
	public VerifyUpdate clickUpdateButton() throws IOException {
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("Submit Button is clicked","pass");
		} catch (Exception e) {
			reportStep("Submit Button is not clicked","fail");
		}
		return new VerifyUpdate(driver,node);
	}

}
