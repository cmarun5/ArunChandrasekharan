package week6.day1.assignment3;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class ServiceNowCreateNewProposal extends ServiceNowBase{
	@BeforeTest
	public void setData() {
		fileName="ServiceNowCreateNewProposal";
	}
	@Test(dataProvider = "testData")
	public void runServiceNowCreateNewProposal(String select) throws IOException, InterruptedException {
		
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(select,Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='My Proposals']").click();
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		
		shadow.findElementByXPath("//div[@class='nav navbar-right text-align-right']//following::button[text()='New']").click();
		shadow.findElementByXPath("//div[@class='form-group is-required']//following::input[@data-type='pick_list']").sendKeys("Create a new proposal");
		Thread.sleep(5000);
		List<WebElement> row = shadow.findElementsByXPath("//tbody[@class='list2_body']/tr[\"+i+\"]");
		System.out.println("row Size: " +row.size());
		WebElement submitbutton = shadow.findElementByXPath("//div[@class='form_action_button_container']/button[text()='Submit']");
		Actions builder = new Actions (driver);
		builder.moveToElement(submitbutton).perform();
		builder.click(submitbutton).perform();
		
		List<WebElement> row1 = shadow.findElementsByXPath("//tbody[@class='list2_body']/tr[\"+i+\"]");
		System.out.println("row Size: " +row1.size());
		if(row.size() < row1.size()){
			System.out.println("New proposal is created successfully");
		}
		else {
			System.out.println("New proposal is not created");
		}
	}
		
}
