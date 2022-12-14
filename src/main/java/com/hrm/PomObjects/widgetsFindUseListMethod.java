package com.hrm.PomObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class widgetsFindUseListMethod 
{
	
	@FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"]") List<WebElement> widgets;
	
	public widgetsFindUseListMethod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	public void verifyWidgets()
	{
		for (WebElement webElement : widgets) 
		{			
			System.out.println(webElement.getText());			
		}
	}

}
