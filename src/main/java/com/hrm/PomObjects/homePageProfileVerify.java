package com.hrm.PomObjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class homePageProfileVerify
{
	
	@FindBy(xpath = "//div[@class=\"oxd-topbar-header-userarea\"]") WebElement profile;
	@FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]") WebElement dropdown;
	@FindBy(xpath = "//div[@class=\"oxd-grid-2 orangehrm-about\"]")WebElement details;
	@FindBy(xpath = "//button[@class=\"oxd-dialog-close-button oxd-dialog-close-button-position\"]") WebElement popup;
	@FindBy(xpath = "//a[@role=\"menuitem\"]") WebElement about;
	@FindBy(xpath = "//a[@class=\"oxd-userdropdown-link\"]") List<WebElement> profileoptions;
	@FindBy(xpath = "(//p[@class=\"oxd-text oxd-text--p orangehrm-about-text\"])[3]") WebElement employee;
	@FindBy(xpath = "//div[@class=\"oxd-grid-2 orangehrm-about\"]") WebElement companydetails;
	
	Actions act ;
	

	
	LoginPage log;
	public homePageProfileVerify(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonabout(WebDriver driver) throws InterruptedException
	{
		act = new Actions(driver);	
		act.moveToElement(dropdown).click().perform();
		for (WebElement menu : profileoptions) 
		{
			System.out.println(menu.getText());			
		}
		about.click();		
	}
	
	public void companyDetails()
	{
		boolean comp = companydetails.isDisplayed();
		Assert.assertTrue(comp);
	}
	
	public void activeemployee()
	{
		String em = employee.getText();
		int emp = Integer.parseInt(em);
		if(emp>0)
		{
			Reporter.log("Employees are: "+emp);
			Assert.assertTrue(true);
			
		}
		else 
			Assert.assertTrue(false);
		
	}
	

}
