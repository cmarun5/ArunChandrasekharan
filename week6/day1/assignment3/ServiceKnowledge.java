package week6.day1.assignment3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class ServiceKnowledge extends ServiceNowBase{
	@BeforeTest
	public void setData() {
		fileName="ServiceKnowledge";
	}
	@Test(dataProvider = "testData")
	public void runServiceKnowledge(String select, String domain, String lang , String status) throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(select,Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//span[text()='Create an Article']").click();
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[@class='input-group ref-container']/input").sendKeys(domain,Keys.TAB);
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[contains(@class,'input-group ref-container')]/input").sendKeys(lang,Keys.TAB);
		shadow.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys(status);
		shadow.findElementByXPath("//div[@class='form_action_button_container']/button").click();
		
	}

	
}
