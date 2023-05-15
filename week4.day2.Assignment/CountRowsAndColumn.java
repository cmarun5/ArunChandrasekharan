package week4.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsAndColumn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		@SuppressWarnings("unused")
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='render']/table"));
		List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
		System.out.println("row count :" + rowcount.size());
		List<WebElement> columncount = driver.findElements(By.tagName("td"));
		System.out.println("column count :" + columncount.size());
	}

}
