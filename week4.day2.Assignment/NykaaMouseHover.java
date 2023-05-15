package week4.day2.assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaMouseHover {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Find element
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		//MouseHover on brands:
		Actions builder = new Actions (driver);
		builder.moveToElement(brand).perform();
		//search L'Oreal paris
		WebElement search = driver.findElement(By.xpath("//ul[@class='l-vertical-list']//a[contains(@href,'loreal-paris')]"));
		Actions builder2=new Actions(driver);
		builder2.click(search).release().perform();
		//check title page
		System.out.println("Title of the page :" +driver.getTitle());
		if(driver.getTitle().contains("L'Oreal Paris")){
			System.out.println("You are at the right page");
		}
		else {
			System.out.println("check your Search to be on the right page");
		}
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Formulation']"));
		Actions builder3=new Actions(driver);
		builder3.scrollToElement(scroll).perform();
		WebElement customerrating = driver.findElement(By.xpath("//span[text()='Avg Customer Rating']"));
		Actions builder4=new Actions(driver);
		builder4.click(customerrating).release().perform();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		System.out.println(text);
		if(text.contains("Shampoo")) {
			System.out.println("Shampoo filter is applied");
		}
		else{
			System.out.println("Select Shampoo from the filter");	
		}
		driver.findElement(By.xpath("//div[@class='showBottomAction hide']/preceding-sibling::div/a")).click();

		Set<String> shampoo = driver.getWindowHandles();
		List<String> selectshampoo	=new ArrayList<String>(shampoo);
		driver.switchTo().window(selectshampoo.get(1));
		String title = driver.getTitle();
		System.out.println("Select shampoo size :" + title);

		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='css-1d0jf8e']//span[contains(text(),'209')]")).getText();
		System.out.println(text2);

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//button[@class='css-aesrxy']/span")).click();

		driver.switchTo().frame(0);
		String text3 = driver.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
		System.out.println("Grand Total:" +text3);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		if(text2!=text3) {
			System.out.println("Shipping charge has been added ");
		}
		else {
			System.out.println("Free shipping charge applicable");
		}
		driver.quit();
	}
}








