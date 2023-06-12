package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {
	public FindLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public DeleteLeadPage clickFindLead() throws IOException {
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Find Leads is clicked","pass");
		} catch (Exception e) {
			reportStep("Find Leads is not clicked","fail");
		}
		return new DeleteLeadPage(driver,node);
	}

}
