package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="EditLead";
	}
	@Test(dataProvider = "testData")
	public void editLeadTest(String uname,String pwd,String pnum,String cname) throws InterruptedException {
		LoginPage lpage= new LoginPage(driver);
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
		.clickEditLeads()
		.updateCName(cname)
		.clickUpdateButton()
		.verifyUpdate();
	}
}
