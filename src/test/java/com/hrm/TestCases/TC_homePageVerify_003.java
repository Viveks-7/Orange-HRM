package com.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.BaseClass.BaseClass;
import com.hrm.PomObjects.LoginPage;
import com.hrm.PomObjects.homePageProfileVerify;

public class TC_homePageVerify_003 extends BaseClass
{
	LoginPage lop;
	homePageProfileVerify hp;
	@BeforeClass
	public void obj() throws IOException
	{
		hp = new homePageProfileVerify(driver);
		lop = new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void login() throws IOException
	{
		lop.enterLoginCred();
	}
	
	@Test(priority=3)
	public void testAbout() throws InterruptedException
	{
		hp.clickonabout(driver);
	}
	
	@Test(priority=4)
	public void testDetails()
	{
		hp.companyDetails();
	}
	
	@Test(priority=5)
	public void testEmployees()
	{
		hp.activeemployee();
	}

}
