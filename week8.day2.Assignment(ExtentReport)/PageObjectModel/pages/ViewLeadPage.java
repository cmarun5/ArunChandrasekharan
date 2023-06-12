package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	public String text;
	public ViewLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
		
	}
	public ViewLeadPage verifyLead() throws IOException {
		
		try {
			text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			reportStep("First name is verified","pass");
		} catch (Exception e) {
			reportStep("First name is not verified","fail");
		}
		System.out.println(text);
		return this;
	}
	
}
