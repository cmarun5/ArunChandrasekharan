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
	public ClickLeadsPage clickLeads() throws IOException {
		try {
			driver.findElement(By.linkText("Leads")).click();
			reportStep("Leads button is clicked","pass");
		} catch (Exception e) {
			reportStep("Leads button is not clicked","fail");
		}
		return new ClickLeadsPage(driver,node);
	}

}
