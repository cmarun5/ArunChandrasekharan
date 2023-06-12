package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="DeleteLead";
		testName = "Login";
		testDescription ="Delete Lead test for leaftap";
		testCategory = "Regression";
		testAuthor ="Arun";
	}
	@Test(dataProvider = "testData")
	public void deleteLeadTest(String uname,String pwd,String pnum) throws InterruptedException, IOException {
	LoginPage lpage =new LoginPage(driver,node);
	lpage.enterUserName(uname)
	.enterPassword(pwd)
	.clickLogin()
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
