package com.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.BaseClass.BaseClass;
import com.hrm.PomObjects.DashboardWidgets;

public class TC_DasboardWidgetsTest_002 extends BaseClass
{
	DashboardWidgets dash;
	
	@BeforeClass
	public void obj() throws IOException
	{
		dash = new DashboardWidgets(driver);
	}
	
	@Test
	public void widgetsdisplay() throws IOException
	{
		dash.widgetsdisplayed();
		screenshotCapture(driver, "Widgets displayed");
	}
	
	@Test
	public void loggedin() throws IOException
	{
		dash.Login();
		
	}
	
	@Test
	public void veriytitleofWidgets()
	{
		dash.verifyWidgetsTitle();
	}

}
