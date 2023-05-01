package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//Enter UserName & password 
		driver.findElement(By.xpath("//form[@id = 'login']//input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		//click on Login Button 
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
	    //click on CRM/SFA Link
		driver.findElement(By.xpath("(//div[@id='form']//a)[2]")).click();
		//click on Leads button
		driver.findElement(By.xpath("(//ul[@class='sectionTabBar']//a)[2]")).click();
		//Click on Find Lead
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[3]")).click();
		//click on phone
		driver.findElement(By.xpath("(//a[@class='x-tab-right']//span)[4]")).click();
		//Enter phone number
		driver.findElement(By.xpath("(//div[@class='x-plain-bwrap']//input)[11]")).clear();
		driver.findElement(By.xpath("(//div[@class='x-plain-bwrap']//input)[11]")).sendKeys("+91");
		driver.findElement(By.xpath("(//div[@class='x-plain-bwrap']//input)[12]")).sendKeys("044");
		driver.findElement(By.xpath("(//div[@class='x-plain-bwrap']//input)[13]")).sendKeys("9791110077");
		//click Find Leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//button)[7]")).click();
		//capture Lead Id
		String getText = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		System.out.println(getText);
		//click first resulting lead
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10203']")).click();
		//click Delete
		//driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[4]")).click();
		//Click on Find Lead
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[3]")).click();
		//enter Captured lead ID
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input")).sendKeys("10203");
		//click Find Leads button
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[3]")).click();
		//verify message
		driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]")).getText();
		System.out.println(getText);
		//close Browser
		driver.close();			
	}

}
