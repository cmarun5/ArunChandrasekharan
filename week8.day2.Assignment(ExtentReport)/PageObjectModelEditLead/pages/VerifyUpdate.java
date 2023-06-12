package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class VerifyUpdate extends ProjectSpecificMethod {
	public String text;
	public VerifyUpdate(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public VerifyUpdate verifyUpdate() throws IOException {
		try {
			text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			reportStep("Company name is Edited Successfully","pass");
		} catch (Exception e) {
			reportStep("Company name is not Edited Successfully","fail");
		}
		System.out.println(text);
		return this;
		
	}

}
