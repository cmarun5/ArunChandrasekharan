package week5.day2.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceKnowledge extends ServiceNowBase{
	@Test(dataProvider = "testData")
	public void runServiceKnowledge(String select) throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(select,Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//span[text()='Create an Article']").click();
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[@class='input-group ref-container']/input").sendKeys("IT",Keys.TAB);
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[contains(@class,'input-group ref-container')]/input").sendKeys("Java",Keys.TAB);
		shadow.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys("Updated KB and Category");
		shadow.findElementByXPath("//div[@class='form_action_button_container']/button").click();
		
	}

	@DataProvider
	public String[] testData() {
	     String[] data= new String [1];
	    
	     data[0]="Knowledge";
	    
	     
	     return data;
}
}
