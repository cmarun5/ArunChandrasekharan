package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="EditLead";
		testName = "EditLead";
		testDescription ="Edit Lead test for leaftap";
		testCategory = "Regression";
		testAuthor ="Arun";
	}
	@Test(dataProvider = "testData")
	public void editLeadTest(String uname,String pwd,String pnum,String cname) throws InterruptedException, IOException {
		LoginPage lpage= new LoginPage(driver,node);
		lpage.enterUserName(uname)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.inputPhoneNo(pnum)
		.clickFindLeads()
		.clickFirstLeads()
		.clickEditLeads()
		.updateCName(cname)
		.clickUpdateButton()
		.verifyUpdate();
	}
}
