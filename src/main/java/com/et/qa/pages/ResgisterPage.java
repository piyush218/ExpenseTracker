package com.et.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.et.qa.base.TestBase;

public class ResgisterPage extends TestBase{

	@FindBy(xpath = "//a[@href='register.jsp'][contains(.,'Register new user')]")
	WebElement Register;
	
	@FindBy(xpath = "//a[contains(.,'Register new user')]")
	WebElement uname;
	
	@FindBy(xpath = "//input[contains(@id,'password1')]")
	WebElement apword;

	@FindBy(xpath = "//input[contains(@id,'password2')]")	
	WebElement bpword;

	
	
	
// Initializing the Page Objects:
	public ResgisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void signUp(String username, String password){
		Register.click();
		uname.sendKeys(username);
		apword.sendKeys(password);
		bpword.sendKeys(password);
}
	
}