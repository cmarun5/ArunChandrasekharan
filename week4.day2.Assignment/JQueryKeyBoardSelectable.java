package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryKeyBoardSelectable {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		@SuppressWarnings("unused")
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4= driver.findElement(By.xpath("//li[text()='Item 4']"));
		//individual click
		Actions builder=new Actions(driver);
		builder.click(item2).click(item4).release().perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("snap/jquery3.png");
		FileUtils.copyFile(source,destination);
		Thread.sleep(5000);
		//keyActions
		builder.keyDown(Keys.CONTROL).click(item4).click(item2).click(item1).keyUp(Keys.CONTROL).perform();
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("snap/jquery2.png");
		FileUtils.copyFile(source1,destination1);

	}

}
