package com.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.BaseClass.BaseClass;
import com.hrm.PomObjects.LoginPage;

public class TC_TestLoginPage_001 extends BaseClass
{
	LoginPage lp;
	
	@BeforeClass
	public void obj()
	{
		lp = new LoginPage(driver);		
	}
	
	@Test(priority=1)
	public void logoverify() throws IOException
	{
		lp.verifyLogo();
		screenshotCapture(driver, "logoverify");
	}

	@Test(priority=2)
	public void loginpanel() throws IOException
	{
		lp.LoginPanel();
		screenshotCapture(driver, "loginpanel");
	}
	
	@Test(priority=3)
	public void logeinuser() throws IOException
	{
		
		lp.enterLoginCred();
	}
	
	@Test(priority=4)
	public void validUser() throws IOException
	{
		lp.validateUser();
		screenshotCapture(driver, "validUser");
	}
}
