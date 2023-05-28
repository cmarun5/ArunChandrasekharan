package week6.day1.assignment2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class SalesForceAdministrator extends SalesForceBase {
	@Test
	public void runSalesForceAdministrator() throws IOException, InterruptedException {
		
		
		WebElement administrator = driver.findElement(By.xpath("//div[text()='Administrator']"));
		driver.executeScript("arguments[0].click();",administrator);
		String title1 = driver.getTitle();
		System.out.println("Title of the page :" +title1);
		if(title1.contains("Administrator")) {
			System.out.println("You are in the Administrator page");
		}
		else {
			System.out.println("Click Administrator and enter");
		}
		List<WebElement> certification1 = driver.findElements(By.xpath("//div[@class='credentials-card_title'][\"+i+\"]//a[1]"));
		for (int i = 0; i <certification1.size() ; i++) {
			System.out.println("Available Certification :" +certification1.get(i).getText());
		
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("snap/salesforceadmin.png");
			FileUtils.copyFile(source,destination);
			
		
			
		}
	}

}
