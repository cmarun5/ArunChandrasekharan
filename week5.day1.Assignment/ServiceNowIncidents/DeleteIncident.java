package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends ServiceNowBase {
	@Test
	public void runDeleteIncident() {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(5);
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		String text =shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").getText();
		System.out.println(text);
		shadow.findElementByXPath("//div[@class='list_header_search']//input[@aria-label='Search column: number']").sendKeys(text,Keys.ENTER);
		shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").click();
		shadow.findElementByXPath("//div[@class='form_action_button_container']//following::button[text()='Delete']").click();
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body container-fluid']//following::div[contains(text(),'Deleting this record will')]")).getText());
		//shadow.findElementByXPath("//div[@class='modal-footer']/button[text()='Delete']").click();
		
}
}
