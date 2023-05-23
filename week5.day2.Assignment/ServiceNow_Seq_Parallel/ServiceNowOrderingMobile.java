package week5.day2.assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class ServiceNowOrderingMobile extends ServiceNowBase {
	@Test
	public void runServiceNowOrderingMobile() throws IOException {
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog",Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		WebElement mobile = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(mobile);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();


		driver.findElement(By.xpath("//strong[contains(text(),'Apple iPhone 13')]")).click();
		driver.findElement(By.xpath("//label[text()='No']")).click();
		driver.findElement(By.xpath("//option[text()='500MB']")).click();
		driver.findElement(By.xpath("//label[text()='Red']")).click();
		driver.findElement(By.xpath("//label[text()='256 GB [add $100.00]']")).click();

		WebElement scroll = driver.findElement(By.xpath("//span[text()='Order Now']"));
		Actions builder1=new Actions(driver);
		builder1.scrollToElement(scroll).perform();

		WebElement ordernow = driver.findElement(By.xpath("//span[text()='Order Now']"));
		Actions builder2 =new Actions(driver);
		builder2.click(ordernow).release().perform();

		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Order request Number : "+text);
		String title = driver.getTitle();
		System.out.println("title of the page : " +title);
		if(title.contains(text)) {
			System.out.println("order is placed successfully");
		}
		else {
			System.out.println("order not placed ");
		}
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("snap/ServiceNow.png");
		FileUtils.copyFile(source,destination);
	}



}


