package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Price of the product : " +text);
		
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("No. of Customer ratings :" +text2);
		
		driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span[@class='a-declarative'])[1]")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='histogramTable']//following::tr"));
        for(int i=1;i<=rows.size();i++) {
        String text1 = driver.findElement(By.xpath("//table[@id='histogramTable']//following::tr["+i+"]")).getText();
        System.out.println("Table : " +text1);
        }
        Thread.sleep(5000);
        
        
		driver.findElement(By.xpath("(//span[contains(text(),'(Renewed) OnePlus 9 Pro 5G')])[1]")).click();
		
		Set<String> amazonsearch = driver.getWindowHandles();
		List<String> amazonwindow =new ArrayList<String>(amazonsearch);
		driver.switchTo().window(amazonwindow.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("snap/amazonrating.png");
		FileUtils.copyFile(source,destination);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cart sub Total :" +text );
		driver.quit();

	}
	
}
