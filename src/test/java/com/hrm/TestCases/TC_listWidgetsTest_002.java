package com.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.BaseClass.BaseClass;
import com.hrm.PomObjects.LoginPage;
import com.hrm.PomObjects.widgetsFindUseListMethod;

public class TC_listWidgetsTest_002 extends BaseClass
{
	widgetsFindUseListMethod wd;
	LoginPage lp;
	
	@BeforeClass
	public void obj()
	{
		lp = new LoginPage(driver);
		wd = new widgetsFindUseListMethod(driver);
	}
	
	@Test(priority=1)
	public void login() throws IOException, InterruptedException
	{
		lp.enterLoginCred();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void test() throws IOException, InterruptedException
	{
		
		wd.verifyWidgets();
	}
	

}
