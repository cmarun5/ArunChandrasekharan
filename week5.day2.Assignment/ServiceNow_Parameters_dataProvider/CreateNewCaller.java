package week5.day2.assignment;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends ServiceNowBase{
	public int i;
	@Test(dataProvider = "testData")
	public void runCreateNewCaller(String select, String fname, String lname, String title ,String mail, String phone, String mobile) throws InterruptedException {

		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(select,Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		shadow.setImplicitWait(5);
		
		shadow.findElementByXPath("//div[@class='nav navbar-right text-align-right']//following::button[text()='New']").click();
		shadow.findElementByXPath("//div[contains(@class,'-5 form-field input_controls')]//input[@id='sys_user.first_name']").sendKeys(fname);
		Thread.sleep(5000);
		shadow.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys(lname);
		shadow.findElementByXPath("//input[@id='sys_user.title']").sendKeys(title,Keys.TAB);
		shadow.findElementByXPath("//input[@id='sys_user.email']").sendKeys(mail);
		shadow.findElementByXPath("//input[@id='sys_user.phone']").sendKeys(phone);
		shadow.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys(mobile);
		
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
		@DataProvider
		public String[] testData() {
		     String[] data= new String [7];
		    
		     data[0]="Callers";
		     data[1]="Arun";
		     data[2]="C";
		     data[3]="Junior Developer";
		     data[4]="cmarun5@gmail.com";
		     data[5]="12345";
		     data[6]="67890";
		     
		     return data;
	}
	}



