package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	public MyHomePage (ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindLeadPage clickLeads() throws IOException {
		try {
			driver.findElement(By.linkText("Leads")).click();
			reportStep("Leads is clicked","pass");
		} catch (Exception e) {
			reportStep("Leads is not clicked","fail");
		}
		return new FindLeadPage(driver,node);
	}

}
