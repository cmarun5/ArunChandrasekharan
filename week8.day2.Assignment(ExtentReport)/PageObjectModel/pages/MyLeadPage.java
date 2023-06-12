package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
	public MyLeadPage (ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateLeadPage createLead() throws IOException {
		try {
			driver.findElement(By.linkText("Create Lead")).click();
			reportStep("createLead is clicked","pass");
		} catch (Exception e) {
			reportStep("createLead is not clicked","fail");
		}
		return new CreateLeadPage(driver,node);
	}
	
}
