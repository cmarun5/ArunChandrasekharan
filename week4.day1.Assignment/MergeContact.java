package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter UserName & password Using id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
	    //click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//Merge contacts
		driver.findElement(By.xpath("(//a[text()='Merge Contacts'])")).click();
		//click on widget of from contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])")).click();
		//create set and list to navigate to newly opened page
		Set<String> windowHandles1 = driver.getWindowHandles();
	    List<String> lstwindowHandles1=new ArrayList<String>(windowHandles1);
	    driver.switchTo().window(lstwindowHandles1.get(1));
	    String ptitle = driver.getTitle();
	    System.out.println(ptitle);
		//click on first resulting contact
	    driver.findElement(By.xpath("//div[contains(@class,'inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
	    //switch to parent window
	    Set<String> windowHandles0 = driver.getWindowHandles();
	    List<String> lstwindowHandles0=new ArrayList<String>(windowHandles0);
	    driver.switchTo().window(lstwindowHandles0.get(0));
	    String ptitle1 = driver.getTitle();
	    System.out.println(ptitle1);
	    //click on widget of to contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//create set and list to navigate to newly opened page
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lstwindowHandles2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwindowHandles2.get(1));
		String ptitle2 = driver.getTitle();
		System.out.println(ptitle2);
		//click on first resulting contact
	    driver.findElement(By.xpath("//div[contains(@class,'inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
	    //switch to parent window
	    Set<String> windowHandles3 = driver.getWindowHandles();
	    List<String> lstwindowHandles3=new ArrayList<String>(windowHandles3);
	    driver.switchTo().window(lstwindowHandles3.get(0));
	    String ptitle3 = driver.getTitle();
	    System.out.println(ptitle3);
	    //click on merge
	    driver.findElement(By.xpath("(//a[text()='Merge'])")).click();
	    //accept alert
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    //verify title of the page
	    System.out.println(driver.getTitle());
	    if (driver.getTitle().contains("Merge Contacts")) {
	    	System.out.println("You are on the right page");
	    }
	    else {
	    	System.out.println("You You are on the Wrong page");
	    }
	    
	    
	}

}
