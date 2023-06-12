package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class HomePage  extends ProjectSpecificMethod{
	public HomePage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyHomePage clickCrmSfa() throws InterruptedException, IOException {
		try {
			driver.findElement(By.linkText("CRM/SFA")).click();
			reportStep("CRM/SFA is clicked","pass");
		} catch (Exception e) {
			reportStep("CRM/SFA is not clicked","fail");
		}
		return new MyHomePage(driver,node);
	}
	public void logOut() {
		//driver.findElement(By.xpath("//form[@id='logout']")).click();
	}
	}
