package week6.day1.assignment2;

import java.io.File;
import java.io.IOException;

import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class SalesForceArchitect extends SalesForceBase {
	@Test
	public void runSalesForceArchitect() throws IOException, InterruptedException {	
		
		Thread.sleep(5000);
		WebElement architect = driver.findElement(By.xpath("//div[text()='Architect']"));
		driver.executeScript("arguments[0].click();",architect);
		String text = driver.findElement(By.xpath("//div[contains(text(),'Salesforce Architects are the most trusted digital')]")).getText();
		System.out.println("Salesforce Architect");
		System.out.println("=====================");
		System.out.println(text);
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		List<WebElement> certification1 = driver.findElements(By.xpath("//div[@class='credentials-card_title'][\"+i+\"]//a[1]"));
		for (int i = 0; i <certification1.size() ; i++) {
			System.out.println("Available Certification :" +certification1.get(i).getText());
		}
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("snap/salesforcearch.png");
			FileUtils.copyFile(source,destination);
		
	}
}


