package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setup() {
		sheets="CreateLead";
		testName = "CreateLead";
		testDescription ="CreateLead in leaftap";
		testCategory = "Regression";
		testAuthor ="Arun";
	}
	@Test(dataProvider = "testData")
	public void createLeadTest(String uname,String pwd,String cname,String fname,String lname,String locname,String dept, String desc,String pnum)throws InterruptedException, IOException {
		LoginPage lpage = new LoginPage(driver,node);
		lpage.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.createLead()
		.companyName(cname)
		.firstName(fname)
		.lastName(lname)
		.firstNameLocal(locname)
		.departmentName(dept)
		.description(desc)
		.phoneNo(pnum)
		.clickSubmitbutton()
		.verifyLead();
		
	}
}
