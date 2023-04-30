package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

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
		driver.findElement(By.linkText("Create new account")).click();
		//Enter firstName
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		//Enter lastName
		driver.findElement(By.name("lastname")).sendKeys("Chandrasekharan");
		//Enter mobileNumber
		driver.findElement(By.name("reg_email__")).sendKeys("9791110077");
		//Enter PassWord
		driver.findElement(By.id("password_step_input")).sendKeys("Arun@1234");
		//Handle all three drop downs
		//birthDay
		WebElement birthday = driver.findElement(By.id("day"));
		Select bday = new Select(birthday);
		bday.selectByIndex(20);
		//month
		WebElement bdaymonth = driver.findElement(By.id("month"));
		Select bmonth = new Select(bdaymonth);
		bmonth.selectByValue("4");
		//year
		WebElement year = driver.findElement(By.id("year"));
		Select byear = new Select(year);
		byear.selectByVisibleText("1987");
		//male or female
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		

	}

}
