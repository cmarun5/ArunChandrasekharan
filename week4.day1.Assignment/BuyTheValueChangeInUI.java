package week4.day1.Assignment;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BuyTheValueChangeInUI {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		driver.findElement(By.xpath("(//h3[contains(text(),'Today Offers')]/following::a[@class='product-title'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("600005");
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();
		Thread.sleep(5000);
		WebElement viewcart = driver.findElement(By.xpath("//a[text()='View Cart']"));
		Actions builder = new Actions (driver);
		builder.moveToElement(viewcart).perform();
		Actions builder1=new Actions(driver);
		builder1.click(viewcart).perform();
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(5000);
		driver.close();
	}

}
