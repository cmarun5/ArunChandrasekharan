package week6.day1.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident extends ServiceNowBase {
	@Test
	public void runUpdateIncident() throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(5);
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[contains(@aria-label,'Open record: ')]").click();
		driver.findElement(By.xpath("//option[contains(text(),'High')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'In Progress')]")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		System.out.println("Incident Status : "+ text2);
		String text3 = driver.findElement(By.xpath("//span[contains(text(),'Moderate')]")).getText();
		System.out.println("Priority :" + text3);
	}
}
