package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;


public class DeleteLeadPage extends ProjectSpecificMethod {
	public static String leadId;
	public DeleteLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public DeleteLeadPage clickPhoneTab() throws IOException {
		try {
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			reportStep("Phone tab is clicked","pass");
		} catch (Exception e) {
			reportStep("Phone tab is not clicked","fail");
		}
		return this;
	}
	public DeleteLeadPage inputPhoneNum(String pnum) throws IOException {
		try {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
			reportStep("Phone Number is entered","pass");
		} catch (Exception e) {
			reportStep("Phone Number is not entered","fail");
		}
		return this;
	}
	public DeleteLeadPage clickFindLeadButton() throws IOException {
		try {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Find Lead Button is clicked","pass");
		} catch (Exception e) {
			reportStep("Find Lead Button is not clicked","fail");
		}
		return this;
	}
	public DeleteLeadPage getTextOfFirstLead() throws IOException {
		@SuppressWarnings("unused")
		DeleteLeadPage input = new DeleteLeadPage(driver,node);
		try {
			leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			reportStep("text of first lead is got successfully","pass");
		} catch (Exception e) {
			reportStep("text of first lead is not got successfully","fail");
		}
		return this;
	}
	public DeleteLeadPage clickFirstResLead() throws InterruptedException, IOException {
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			reportStep("First Resulting lead is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("First Resulting lead is not clicked successfully","fail");
		}
		return this;
	}
	public VerifyDeleteLead clickDeleteButton() throws IOException {
		try {
			driver.findElement(By.linkText("Delete")).click();
			reportStep("Delete Button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Delete Button is not clicked successfully","fail");
		}
		return new VerifyDeleteLead(driver,node);
	}
	
	
}
