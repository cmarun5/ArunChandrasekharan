package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String sheets;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider
    public String[][] testData() throws IOException  {
        String[][] readData = ReadExcel.readData(sheets);
         return readData;
}
}
