package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_pages {
	WebDriver driver;
	public OrangeHRM_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	WebElement username;
	public WebElement getusername() {
		return username;
	}
	@FindBy(id="txtPassword")
	WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	@FindBy(id="btnLogin")
	WebElement login;
	public WebElement getlogin() {
		return login;
	}
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	public WebElement getadmin() {
		return admin;
	}
	@FindBy(id="menu_admin_Job")
	WebElement job;
	public WebElement getjob() {
		return job;
	}
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/span")
	WebElement orange;
	public WebElement getorange() {
		return orange;
	}

}
