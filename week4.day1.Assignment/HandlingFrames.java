package week4.day1.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");

		//Switch to Frame
		driver.switchTo().frame(0);
		//Click Me (Inside frame)
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		String text = driver.findElement(By.xpath("//button[contains(text(),'You Clicked Me.')]")).getText();
		System.out.println("Click Me (Inside frame): " +text);
		//switch to parent frame
		driver.switchTo().defaultContent();
		//switch to frame 2
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		//Click Me (Inside Nested frame)
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		String text2 = driver.findElement(By.xpath("//button[contains(text(),'You Clicked Me.')]")).getText();
		System.out.println("Click Me (Inside Nested frame): " +text2);
		//How many frames in this page?
		driver.switchTo().defaultContent();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame in the page : " + frame.size());
		Thread.sleep(5000);
		driver.quit();
	}
}