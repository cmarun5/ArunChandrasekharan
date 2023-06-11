package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		sheets="Login";
	}
	@Test(dataProvider = "testData")
	public void loginTest(String uname,String pwd)throws InterruptedException {
		LoginPage lpage =new LoginPage(driver);
		lpage.enterusername(uname)
		.enterPassword(pwd)
		.clickLoginButton();
	}
}
