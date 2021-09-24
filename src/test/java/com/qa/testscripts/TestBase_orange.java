package com.qa.testscripts;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qa.pages.OrangeHRM_pages;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase_orange {
	WebDriver driver;
	OrangeHRM_pages orange;
	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		orange=new OrangeHRM_pages(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	public void captureScreenshot(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File(System.getProperty("user.dir")+"/Screenshots/"+".png");
		FileUtils.copyFile(Source, Target);
		System.out.println("Screenshot captured");
	}

}
