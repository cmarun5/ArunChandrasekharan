package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewOption extends ServiceNowBase {

	@Test
	public void runcreateNewOption() throws InterruptedException  {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(5);
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		WebElement newbutton = driver.findElement(By.xpath("//button[text()='New']"));
		Actions builder = new Actions (driver);
		builder.moveToElement(newbutton).perform();
		Actions builder2=new Actions(driver);
		builder2.click(newbutton).perform();
		shadow.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Create New Option");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		if (title.contains("Create")) {
			System.out.println("The incident is created correctly");
		}
		else {
			System.out.println("Incident is not created");
		}
	
		
	
	}

}
