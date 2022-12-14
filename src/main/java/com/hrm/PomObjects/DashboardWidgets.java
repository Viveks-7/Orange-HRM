package com.hrm.PomObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrm.BaseClass.BaseClass;

public class DashboardWidgets
{
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[1]")
	WebElement w1;
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[2]")
	WebElement w2;
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[3]")
	WebElement w3;
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[4]")
	WebElement w4;
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[5]")
	WebElement w5;
	@FindBy(xpath = "(//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"])[6]")
	WebElement w6;
	@FindBy(name ="username") WebElement mail;
	@FindBy(name ="password") WebElement password;
	@FindBy(xpath ="//button[@type='submit']") WebElement loginbtn;
	
	
	BaseClass bs;
	
	public DashboardWidgets(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login() throws IOException
	{
		bs = new BaseClass();
		
		mail.sendKeys(bs.readconfig("un"));
		password.sendKeys(bs.readconfig("pwd"));
		loginbtn.click();
		
	}
	
	public void widgetsdisplayed() throws IOException
	{
		boolean w11 = w1.isDisplayed();
		boolean w22=w2.isDisplayed();
		boolean w33=w3.isDisplayed();
		boolean w44=w4.isDisplayed();
		boolean w55=w5.isDisplayed();
		boolean w66=w6.isDisplayed();
		
		if(w11==w22==w33==w44==w55==w66==true)
		{
			System.out.println("All 6 widgets are displayed successsfylly");			
		}
		else
		{
			System.out.println("All widgets are not displayed");						
		}
	}
	
	public void verifyWidgetsTitle()
	{
		String wi1 = "Time at Work";
//		String wi2 ="My Actions No Pending Actions to Perform";
				
		String wi3 = "Quick Launch";
		String wi4 = "Employees on Leave Today";
		String wi5 = "Employee Distribution by Sub Unit";
		String wi6 = "Employee Distribution by Location";
		
		System.out.println("widget w1 text: "+w1.getText());
		System.out.println("widget w2 text: "+w2.getText());
		System.out.println("widget w3 text: "+w3.getText());
		System.out.println("widget w4 text: "+w4.getText());
		System.out.println("widget w5 text: "+w5.getText());
		System.out.println("widget w6 text: "+w6.getText());

		Assert.assertEquals(wi1	, w1.getText());
//		Assert.assertEquals(wi2	, w2.getText());
		Assert.assertEquals(wi3	, w3.getText());
		Assert.assertEquals(wi4	, w4.getText());
		Assert.assertEquals(wi5	, w5.getText());
		Assert.assertEquals(wi6	, w6.getText());
		
		
		
		
	}
	
	
	
	
	
	

}
