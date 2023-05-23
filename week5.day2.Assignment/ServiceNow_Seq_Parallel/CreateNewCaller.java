package week5.day2.assignment;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends ServiceNowBase{
	public int i;
	@Test
	public void runCreateNewCaller() throws InterruptedException {

		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers",Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		shadow.setImplicitWait(5);
		
		shadow.findElementByXPath("//div[@class='nav navbar-right text-align-right']//following::button[text()='New']").click();
		shadow.findElementByXPath("//div[contains(@class,'-5 form-field input_controls')]//input[@id='sys_user.first_name']").sendKeys("Arun");
		Thread.sleep(5000);
		shadow.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys("C");
		shadow.findElementByXPath("//input[@id='sys_user.title']").sendKeys("Junior Developer",Keys.TAB);
		shadow.findElementByXPath("//input[@id='sys_user.email']").sendKeys("cmarun5@gmail.com");
		shadow.findElementByXPath("//input[@id='sys_user.phone']").sendKeys("12345");
		shadow.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys("67890");
		
		List<WebElement> row = shadow.findElementsByXPath("//tbody[@class='list2_body']//tr["+i+"]");
		System.out.println("Before creating row size :" +row.size());

		shadow.findElementByXPath("//div[@class='form_action_button_container']/button[text()='Submit']").click();

		List<WebElement> row1 = shadow.findElementsByXPath("//tbody[@class='list2_body']//tr["+i+"]");
		System.out.println("Before creating row size :" +row1.size());

		if(row.size() < row1.size()) {
			System.out.println("New caller has been created successfully");
		}
		else {
			System.out.println("New caller not created Successfully");
		
		}
	}
	}



