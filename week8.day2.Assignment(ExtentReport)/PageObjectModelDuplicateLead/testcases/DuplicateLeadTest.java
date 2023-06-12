package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="DuplicateLead";
		testName = "DuplicateLead";
		testDescription ="Duplicate Lead test for leaftap";
		testCategory = "Regression";
		testAuthor ="Arun";
	}
	@Test(dataProvider = "testData")
	public void duplicateLeadTest(String uname, String pwd, String pnum) throws InterruptedException, IOException {
		LoginPage lpage = new LoginPage(driver,node);
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
