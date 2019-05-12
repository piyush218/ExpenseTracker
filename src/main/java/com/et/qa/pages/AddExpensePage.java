package com.et.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.et.qa.base.TestBase;

public class AddExpensePage extends TestBase {
	
	

	@FindBy(xpath = "//a[contains(@id,'expense')][@href='addexpense.jsp'][contains(.,'Add Expense')]")
	WebElement addExpense;
	
	@FindBy(xpath = "//input[contains(@id,'day')]")
	WebElement day;
	
	@FindBy(xpath = "//input[contains(@id,'month')]")
	WebElement month;
	
	@FindBy(xpath = "//input[contains(@id,'year')]")
	WebElement year;

	@FindBy(xpath = "//input[contains(@id,'amount')]")
	WebElement amount;
	
	@FindBy(xpath = "//select[contains(@id,'category')]")
	WebElement category;

	@FindBy(xpath = "//input[contains(@id,'reason')]")
	WebElement reason;
	
	@FindBy(xpath = "//input[contains(@id,'submit')]")
	WebElement submit;


	
	
	
// Initializing the Page Objects:
	public AddExpensePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectCategory(String name){
		driver.findElement(By.xpath("//a[text()=")+"name");
	}
	
	
	
	
	public void createExpense(String iday, String imonth, String iyear, String iCateogory, String iAmount, String reason){
		addExpense.click();
		day.sendKeys(iday);
		month.sendKeys(imonth);
		year.sendKeys(iyear);
		category.sendKeys(iCateogory);
		amount.sendKeys(iAmount);
		day.sendKeys(iday);
		submit.click();

		
}

}
