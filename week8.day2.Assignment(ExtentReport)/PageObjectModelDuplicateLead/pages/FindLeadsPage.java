package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod {
public FindLeadsPage(ChromeDriver driver,ExtentTest node) {
	this.driver=driver;
	this.node=node;
}
	public DuplicateLeadPage clickFindLeads() throws IOException {
		
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("find Leads is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("find Leads is not clicked successfully","fail");
		}
		return new DuplicateLeadPage(driver,node);
	}
}
