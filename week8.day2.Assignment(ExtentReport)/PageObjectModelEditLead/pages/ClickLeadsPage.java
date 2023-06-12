package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class ClickLeadsPage extends ProjectSpecificMethod {
public ClickLeadsPage(ChromeDriver driver,ExtentTest node) {
	this.driver=driver;
	this.node=node;
}
	public EditLeadsPage clickFindLeads() throws IOException {
		
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Find Leads button is clicked","pass");
		} catch (Exception e) {
			reportStep("Find Leads button is not clicked","fail");
		}
		return new EditLeadsPage(driver,node);
	}
}
