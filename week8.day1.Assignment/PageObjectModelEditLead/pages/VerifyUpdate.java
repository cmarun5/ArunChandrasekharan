package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class VerifyUpdate extends ProjectSpecificMethod {
	public VerifyUpdate(ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyUpdate verifyUpdate() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		return this;
		
	}

}
