package week6.day1.assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AssignIncidentUIChange extends ServiceNowBase{
	@BeforeTest
	public void setData() {
		fileName="AssignIncidentUIChange";
	}
	@Test(dataProvider = "testData")
	public void runAssignIncident(String group) throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		WebElement frame0 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame0);
		driver.findElement(By.xpath("//span[@id='incident_hide_search']//following::select")).click();
		driver.findElement(By.xpath("//span[@id='incident_hide_search']//following::option[contains(text(),'Number')]")).click();
		String text = shadow.findElementByXPath("//tbody[@class='list2_body']//following::a[@class='linked formlink']").getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='input-group']//following-sibling::input")).sendKeys(text,Keys.ENTER);
		driver.findElement(By.xpath("//h1[@class='navbar-title list_title ']//following-sibling::span[contains(text(),'View: Self Service')]")).click();
		driver.findElement(By.xpath("//div[@id='context_list_titleincident']//following::div[text()='View']")).click();
		driver.findElement(By.xpath("//div[@class='context_menu']//following::div[text()='Default view']")).click();
		driver.findElement(By.xpath("//tbody[@class='list2_body']//following::a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).sendKeys(group,Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='navbar_ui_actions']/button[text()='Update']")).click();
		String text2 = driver.findElement(By.xpath("//tbody[@class='list2_body']//following::a[text()='Software']")).getText();
		if (text2.contains("Software")) {
			System.out.println("Assignment Group is assigned correctly");
		}
		else {
			System.out.println("Assignment Group is not assigned correctly");
		}
		
	}
}
