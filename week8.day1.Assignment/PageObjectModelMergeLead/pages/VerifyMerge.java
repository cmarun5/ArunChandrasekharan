package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class VerifyMerge extends ProjectSpecificMethod {
	public VerifyMerge(ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyMerge verifyMerge() throws IOException {
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("snap/SalesForcesQuestion.png");
	FileUtils.copyFile(source,destination);
	return this;
}
}