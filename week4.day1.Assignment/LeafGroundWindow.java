package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");

		//driver get page title
		String title = driver.getTitle();
		System.out.println("Parent page : " +title);
		Thread.sleep(5000);

		//Click and Confirm new Window Opens

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		//create set and list to navigate to newly opened page

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindowHandles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindowHandles.get(1));
		String ptitle = driver.getTitle();
		System.out.println("child Page :" + ptitle);
		driver.close();
		Thread.sleep(5000);

		//move to parent page

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> lstwindowHandles1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstwindowHandles1.get(0));
		String ptitle1 = driver.getTitle();
		System.out.println("Parent Page :" + ptitle1);
		Thread.sleep(5000);

		//Close all windows except Primary

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();


		//create set and list to navigate to newly opened page

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lstwindowHandles2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwindowHandles2.get(1));
		String ptitle2 = driver.getTitle();
		System.out.println("child Page :" + ptitle2);
		driver.close();
		Thread.sleep(5000);

		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> lstwindowHandles3=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(lstwindowHandles3.get(2));
		String ptitle3 = driver.getTitle();
		System.out.println("child Page :" + ptitle3);
		driver.close();
		Thread.sleep(5000);

		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> lstwindowHandles4=new ArrayList<String>(windowHandles4);
		driver.switchTo().window(lstwindowHandles4.get(1));
		String ptitle4 = driver.getTitle();
		System.out.println("child Page :" + ptitle4);
		driver.close();
		Thread.sleep(5000);

		//move to parent page

		Set<String> windowHandles5 = driver.getWindowHandles();
		List<String> lstwindowHandles5=new ArrayList<String>(windowHandles5);
		driver.switchTo().window(lstwindowHandles5.get(0));
		String ptitle5 = driver.getTitle();
		System.out.println("Parent Page :" + ptitle5);
		Thread.sleep(5000);

		//Find the number of opened tabs

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles6 = driver.getWindowHandles();
		List<String> tab =new ArrayList<String>(windowHandles6);
		System.out.println("No. of tabs : " + tab.size());
		Thread.sleep(5000);
		
		
		Set<String> windowHandles7 = driver.getWindowHandles();
		List<String> lstwindowHandles7=new ArrayList<String>(windowHandles7);
		driver.switchTo().window(lstwindowHandles7.get(1));
		String ptitle7 = driver.getTitle();
		System.out.println("Parent Page :" + ptitle7);
		driver.close();
		Thread.sleep(5000);
		
		Set<String> windowHandles8 = driver.getWindowHandles();
		List<String> lstwindowHandles8=new ArrayList<String>(windowHandles8);
		driver.switchTo().window(lstwindowHandles8.get(1));
		String ptitle8 = driver.getTitle();
		System.out.println("Parent Page :" + ptitle8);
		driver.close();
		Thread.sleep(5000);


		//move to parent page

		Set<String> windowHandles9 = driver.getWindowHandles();
		List<String> lstwindowHandles9=new ArrayList<String>(windowHandles9);
		driver.switchTo().window(lstwindowHandles9.get(0));
		String ptitle9 = driver.getTitle();
		System.out.println("Parent Page :" + ptitle9);
		Thread.sleep(5000);


		//Wait for 2 new tabs to open

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles10 = driver.getWindowHandles();
		List<String> tab1 =new ArrayList<String>(windowHandles10);
		System.out.println("No. of tabs : " + tab1.size());
		Thread.sleep(5000);
		driver.quit();
	}

}
