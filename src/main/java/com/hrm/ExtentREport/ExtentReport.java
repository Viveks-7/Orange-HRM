package com.hrm.ExtentREport;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener
{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeTest
	public void startreport()
	{
		// change report name for new project everytime and check report folder path and folder name
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String reportname = "Orange HRM-"+timestamp+".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//ExtentReport//"+ reportname);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		
		// add environment details 
		reports.setSystemInfo("Machine", "Test_PC_1");
		reports.setSystemInfo("OS", "Windows 10 PRO");
		reports.setSystemInfo("User", "Vendetta");
		reports.setSystemInfo("Browser", "Chrome");
		
		
		// configuration to change look and feel
		htmlReporter.config().setDocumentTitle(" Extent Reports Demo");
		htmlReporter.config().setReportName("Vendetta Test Reports");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEE, mm dd, yyyy, hh:mm a '('zzz')' ");
				
		
	}
	
	
	 public void onFinish(ITestContext Result) 					
	    {		
	            System.out.println("On finish method invoked...");    		
	            reports.flush(); // mandatory to call flush method to get report output
	    }		

	    public void onStart(ITestContext Result)					
	    {		
	         startreport();
	         System.out.println("On start method invoked...");
	    }		

	  		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		

	    // When Test case get failed, this method is called.		
	   		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    	System.out.println("The name of the testcase failed is :"+Result.getName());					
	    	test = reports.createTest(Result.getName());
	    	test.log(Status.FAIL, MarkupHelper.createLabel("Name of failed test case is: "+Result.getName(), ExtentColor.RED));
	    	
	    	
	    }		

	    // When Test case get Skipped, this method is called.		

	    public void onTestSkipped(ITestResult Result)					
	    {		
	    	System.out.println("The name of the testcase Skipped is :"+Result.getName());
	    	test = reports.createTest(Result.getName());
	    	test.log(Status.SKIP, MarkupHelper.createLabel("The name of the testcase Skipped is :"+Result.getName(), ExtentColor.YELLOW));
	    }		

	    // When Test case get Started, this method is called.		

	    public void onTestStart(ITestResult Result)					
	    {		
	    	System.out.println(Result.getName()+" test case started");					
	    }		

	    // When Test case get passed, this method is called.		

	    public void onTestSuccess(ITestResult Result)					
	    {		
	    	System.out.println("The name of the testcase passed is :"+Result.getName());
	    	test = reports.createTest(Result.getName());
	    	test.log(Status.PASS, MarkupHelper.createLabel("The name of the testcase passed is :"+Result.getName(), ExtentColor.GREEN));
	    	
	    }

}
