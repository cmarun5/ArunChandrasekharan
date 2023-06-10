package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="DuplicateLead";
	}
	@Test(dataProvider = "testData")
	public void duplicateLeadTest(String uname, String pwd, String pnum) throws InterruptedException {
		LoginPage lpage = new LoginPage(driver);
		lpage.enterusername(uname)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.inputPhoneNo(pnum)
		.clickFindLeads()
		.clickFirstLeads()
		.clickDuplicateLead()
		.clickCreateLeads()
		.verifyDuplicateLead();
		
	
	}
}
