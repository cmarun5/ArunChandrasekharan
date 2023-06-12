package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class VerifyDuplicateLead extends ProjectSpecificMethod {
	public String text;
	public VerifyDuplicateLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public VerifyDuplicateLead verifyDuplicateLead() throws IOException {
		
		try {
			text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			reportStep("Duplicate Lead is Verified","pass");
		} catch (Exception e) {
			reportStep("Duplicate Lead is not Verified","fail");
		}
		System.out.println(text);
		return this;
	}

}

