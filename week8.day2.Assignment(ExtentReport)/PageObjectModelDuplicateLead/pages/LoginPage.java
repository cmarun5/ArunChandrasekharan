package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public LoginPage enterusername(String uname) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep(uname+"UserName entered is valid","pass");
		} catch (Exception e) {
			reportStep(uname+"UserName entered is not valid","fail");
		}
		return this;
	}
	public LoginPage enterPassword(String pwd) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportStep(pwd+"Password entered is valid","pass");
		} catch (Exception e) {
			reportStep(pwd+"Password entered is not valid","fail");
		}
		return this;
	}
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Submit Button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Submit Button is not clicked successfully","fail");
		}
		return new HomePage(driver,node);
	}
}
