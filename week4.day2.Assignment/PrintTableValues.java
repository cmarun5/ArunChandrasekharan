package week4.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableValues {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		@SuppressWarnings("unused")
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='render']/table"));
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]")).getText();
		System.out.println("Absolute usage data :\n" +text);
}

}
