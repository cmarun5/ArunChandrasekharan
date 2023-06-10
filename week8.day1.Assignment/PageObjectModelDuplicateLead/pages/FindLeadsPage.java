package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod {
public FindLeadsPage(ChromeDriver driver) {
	this.driver=driver;
}
	public DuplicateLeadPage clickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		return new DuplicateLeadPage(driver);
	}
}
