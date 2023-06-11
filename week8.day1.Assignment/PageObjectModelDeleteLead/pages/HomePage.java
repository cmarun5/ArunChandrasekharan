package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePage  extends ProjectSpecificMethod{
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmSfa() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public void logOut() {
		//driver.findElement(By.xpath("//form[@id='logout']")).click();
	}
	}
