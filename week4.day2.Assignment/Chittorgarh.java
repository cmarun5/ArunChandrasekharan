package week4.day2.assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//click on stock market
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		//click on NSE bulk deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		//Get all the security  names
		@SuppressWarnings("unused")
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]"));
		List<WebElement> securitynames = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr[\"+i+\"]/following::td[1]"));
		for (int i = 0; i < securitynames.size(); i++) {
				
				System.out.println(securitynames.get(i).getText());
		}
	}

	
}
	



