package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="DeleteLead";
	}
	@Test(dataProvider = "testData")
	public void deleteLeadTest(String uname,String pwd,String pnum) throws InterruptedException {
	LoginPage lpage =new LoginPage(driver);
	lpage.enterusername(uname)
	.enterPassword(pwd)
	.clickLoginButton()
	.clickCrmSfa()
	.clickLeads()
	.clickFindLead()
	.clickPhoneTab()
	.inputPhoneNum(pnum)
	.clickFindLeadButton()
	.getTextOfFirstLead()
	.clickFirstResLead()
	.clickDeleteButton()
	.clickFindLeadButton()
	.searchForDeletedLead()
	.clickFindLeads()
	.verifyDelete();
	}	
}
