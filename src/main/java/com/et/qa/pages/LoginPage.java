package com.et.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.et.qa.base.TestBase;

public class LoginPage extends TestBase {

	
//	Page Factory - OR
	@FindBy(name = "Login")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id = "submit")
	WebElement submit;
	
	
	//initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	 public HomePage login(String un, String pwd) {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 submit.click();
		 
		 return new HomePage();
	 }
}