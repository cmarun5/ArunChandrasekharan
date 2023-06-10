package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class VerifyDuplicateLead extends ProjectSpecificMethod {
	public VerifyDuplicateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyDuplicateLead verifyDuplicateLead() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		return this;
	}

}

