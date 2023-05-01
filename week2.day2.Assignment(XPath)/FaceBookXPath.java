package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookXPath {

	public static void main(String[] args) {
		//Load driver
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//click New account button
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		//Enter firstName
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Arun");
		//Enter lastName
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input")).sendKeys("Chandrasekharan");
		//Enter mobileNumber
		driver.findElement(By.xpath("//div[@class='mbm _a4y']//input")).sendKeys("9791110077");
		//Enter PassWord
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input")).sendKeys("Arun@1234");
		//Handle all three drop downs
		//birthDay
		WebElement birthday = driver.findElement(By.xpath("//div[@class='_5k_5']//select"));
		Select bday = new Select(birthday);
		bday.selectByIndex(20);
		//month
		WebElement bdaymonth = driver.findElement(By.xpath("(//div[@class='_5k_5']//select)[2]"));
		Select bmonth = new Select(bdaymonth);
		bmonth.selectByValue("4");
		//year
		WebElement year = driver.findElement(By.xpath("(//div[@class='_5k_5']//select)[3]"));
		Select byear = new Select(year);
		byear.selectByVisibleText("1987");
		//male or female
		driver.findElement(By.xpath("(//div[@class='mtm _5wa2 _5dbb']//label)[2]")).click();

	}

}
