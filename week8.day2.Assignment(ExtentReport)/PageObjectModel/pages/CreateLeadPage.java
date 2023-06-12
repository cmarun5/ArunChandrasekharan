package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public CreateLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateLeadPage firstName(String uname) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(uname);
			reportStep("First name is entered","pass");
		} catch (Exception e) {
			reportStep("First name is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage lastName(String lname) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			reportStep("Last name is entered","pass");
		} catch (Exception e) {
			reportStep("Last name is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage companyName(String cname) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			reportStep("company name is entered","pass");
		} catch (Exception e) {
			reportStep("company name is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage firstNameLocal(String locname) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(locname);
			reportStep("First name local is entered","pass");
		} catch (Exception e) {
			reportStep("First name local is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage departmentName(String dept) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
			reportStep("Department name is entered","pass");
		} catch (Exception e) {
			reportStep("Department name is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage description(String desc) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);
			reportStep("Description is entered","pass");
		} catch (Exception e) {
			reportStep("Description is not entered","fail");
		}
		return this;
	}
	public CreateLeadPage phoneNo(String pnum) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
			reportStep("Phone Number is entered","pass");
		} catch (Exception e) {
			reportStep("Phone Number is not entered","fail");
		}
		return this;
	}
	public ViewLeadPage clickSubmitbutton() throws IOException {
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("Submit button is clicked","pass");
		} catch (Exception e) {
			reportStep("Submit button is not clicked","fail");
		}
		return new ViewLeadPage(driver,node);
	}
}
