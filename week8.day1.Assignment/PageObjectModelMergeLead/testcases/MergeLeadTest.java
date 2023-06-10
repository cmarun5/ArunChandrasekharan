package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="MergeLead";
	}
	@Test(dataProvider = "testData")
	public void MergeLeadTest (String uname, String pwd,String fname1,String fname2) throws IOException, InterruptedException {
		LoginPage lpage = new LoginPage(driver);
		lpage.enterusername(uname)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLeads()
		.clickMerge()
		.clickFromLeadImg()
		.handleFromWindow()
		.enterFromFirstName(fname1)
		.clickFromFindLeads()
		.clickFromFirstLead()
		.switchFromParentWindow()
		.clickToLeadImg()
		.handleToWindow()
		.enterToFirstName(fname2)
		.clcikToFindLead()
		.clickToFirstLead()
		.switchToParentWindow()
		.clickMergeButton()
		.handleAlert()
		.verifyMerge();
		
	}
}
