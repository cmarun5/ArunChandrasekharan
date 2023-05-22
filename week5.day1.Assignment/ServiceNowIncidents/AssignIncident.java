package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
public class AssignIncident extends ServiceNowBase{
	@Test
	public void runAssignIncident() throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		String text = shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").getText();
		System.out.println(text);
		shadow.findElementByXPath("//tr[@id='hdr_incident']//button").click();
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[@class='list_header_search']//input[contains(@class,'list_header_search')]").sendKeys(text,Keys.ENTER);
		shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").click();
		shadow.findElementByXPath("//div[@class='vsplit col-sm-6']//following::a[@aria-label='Show related incidents']").click();
		shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").click();
		shadow.findElementByXPath("//div[@id='label.incident.category']//following::select[@id='incident.category']").click();
		shadow.findElementByXPath("//div[@id='label.incident.category']//following::select[@id='incident.category']/option[text()='Software']").click();
		shadow.findElementByXPath("//div[@id='single-input-journal-entry']//following::textarea[@id='activity-stream-textarea']").sendKeys("updated category to Software");
		shadow.findElementByXPath("//div[@class='form_action_button_container']/button[contains(text(),'Update')]").click();
		System.out.println(shadow.findElementByXPath("//li[contains(@class,'h-card h')]//following::span[contains(@class,'sn-widget-textblock')]").getText());
		shadow.findElementByXPath("//div[@id='element.incident.caller_id']//following::a[contains(@id,'show_incidents')]").click();
		System.out.println(driver.findElement(By.xpath("//tbody[@class='list2_body']//following::td[text()='Software']")).getText());
	}
}
