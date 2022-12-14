package com.hrm.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	protected WebDriver driver;	
	
	@BeforeClass
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\HRM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get(readconfig("url"));		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

	public String readconfig(String key) throws IOException
	{
		Properties cnf = new Properties();
		FileInputStream readcnf = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\HRM\\configuration\\config.properties");
		cnf.load(readcnf);
		String value = cnf.getProperty(key);
		return value;
		
	}
	
	public void screenshotCapture(WebDriver driver , String testname) throws IOException
	{
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new java.util.Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\"+timestamp+"-"+testname+".jpg");
		FileHandler.copy(src, destination);
				
	}
}
