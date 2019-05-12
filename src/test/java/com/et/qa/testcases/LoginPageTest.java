package com.et.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.et.qa.base.TestBase;
import com.et.qa.pages.HomePage;
import com.et.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage= new LoginPage();
	}
		
	@Test
	public void logintest() {
			homePage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	}		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
