package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="Login";
		testName = "Login";
		testDescription ="Login test for leaftap";
		testCategory = "Regression";
		testAuthor ="Arun";
	}
	@Test(dataProvider = "testData")
	public void loginTest(String uname,String pwd)throws InterruptedException, IOException {
		LoginPage lpage =new LoginPage(driver,node);
		lpage.enterUserName(uname)
		.enterPassword(pwd)
		.clickLoginButton();
	}
}
