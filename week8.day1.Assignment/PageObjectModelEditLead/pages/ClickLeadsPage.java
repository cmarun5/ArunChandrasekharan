package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ClickLeadsPage extends ProjectSpecificMethod {
public ClickLeadsPage(ChromeDriver driver) {
	this.driver=driver;
}
	public EditLeadsPage clickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		return new EditLeadsPage(driver);
	}
}
