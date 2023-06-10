package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
public class ClickMergeLead extends ProjectSpecificMethod{
	public ClickMergeLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public ClickMergeLead clickMerge() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return this;
	}
	public ClickMergeLead clickFromLeadImg() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	public ClickMergeLead handleFromWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}
	public ClickMergeLead enterFromFirstName(String fname1) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname1);
		return this;
	}
	public ClickMergeLead clickFromFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public ClickMergeLead clickFromFirstLead() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public ClickMergeLead switchFromParentWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	public ClickMergeLead clickToLeadImg() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	public ClickMergeLead handleToWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}
	public ClickMergeLead enterToFirstName(String fname2) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname2);
		return this;
	}
	public ClickMergeLead clcikToFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public ClickMergeLead clickToFirstLead() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public ClickMergeLead switchToParentWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	public ClickMergeLead clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	public VerifyMerge handleAlert() {
		driver.switchTo().alert().accept();
		return new VerifyMerge(driver);
	}
	
}
