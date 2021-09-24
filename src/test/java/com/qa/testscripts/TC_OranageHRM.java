package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_OranageHRM extends TestBase_orange{
	@Test
	public void validate() throws IOException {
		String title= driver.getTitle();
		if(title.contains("OrangeHRM")) {
			Assert.assertTrue(true);
		}
		else {
			captureScreenshot(driver,"validate");
			Assert.assertTrue(false);
		}
		orange.getusername().sendKeys("Admin");
		orange.getPassword().sendKeys("admin123");
		orange.getlogin().click();
	}
}
