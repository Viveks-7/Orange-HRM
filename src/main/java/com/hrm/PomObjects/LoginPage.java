package com.hrm.PomObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.BaseClass.BaseClass;

public class LoginPage 
{
	@FindBy(name ="username") WebElement mail;
	@FindBy(name ="password") WebElement password;
	@FindBy(xpath ="//button[@type='submit']") WebElement loginbtn;
	@FindBy(xpath ="//img[@alt='company-branding']") WebElement logo;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']") WebElement user;
	@FindBy(xpath = "//div[@class='orangehrm-login-form']") WebElement loginpanel;
	
	
	BaseClass bs;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo()
	{
		boolean actResult = logo.isDisplayed();
		boolean expResult = true;
		if(expResult==actResult)
		{
			System.out.println("Orange HRM Logo is Displayed... ");
		}
		else
			System.out.println("Orange HRM Logo is NOT Displayed...");
		
	}
	
	public void LoginPanel()
	{
		boolean panel = loginpanel.isEnabled();
		if(panel==true)
		{
			System.out.println("Login panel is displayed...");
		}
		else
			System.out.println("Login panel is not displayed");
	}
	
	public void enterLoginCred() throws IOException
	{
		bs = new BaseClass();
		
		mail.sendKeys(bs.readconfig("un"));
		password.sendKeys(bs.readconfig("pwd"));
		loginbtn.click();
	}
	
	public void validateUser()
	{
		String admin = user.getText();
		System.out.println("The logged user's name: "+admin);
		String expadmin = "Siri Gundu";
		assertEquals(admin, expadmin);
		
	}
	

}
