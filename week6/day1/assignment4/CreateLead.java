package week6.day1.assignment4;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CreateLead extends MethodSpecific {
	@BeforeTest
	public void setData() {
		fileName="CreateLead";
	}
	@Test(dataProvider = "testData")
	public void runcreateLead(String cname,String fname,String lname,String pnum ) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();	
}
	
}







