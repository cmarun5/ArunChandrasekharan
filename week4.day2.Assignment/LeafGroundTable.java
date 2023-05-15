package week4.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		@SuppressWarnings("unused")
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table"));
		List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
		System.out.println("row count :" + rowcount.size());
		List<WebElement> columncount = driver.findElements(By.tagName("td"));
		System.out.println("column count :" + columncount.size());

		//First column
		for(int i=1;i<columncount.size();i++) {
			System.out.println(columncount.get(i).getText());

		}
		//First Row
		for(int i=1;i<rowcount.size();i++) {
			System.out.println(rowcount.get(i).getText());
		}


	}
}