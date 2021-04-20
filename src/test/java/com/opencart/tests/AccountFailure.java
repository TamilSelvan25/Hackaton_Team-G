package com.opencart.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AccountFailure extends BaseClass{
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeTest
	public void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");

	test = report.startTest("MainTest");
	}
	
			@Test(priority=0, groups= {"group1","group2"})
			public void setup() throws Exception{

				 Launchbrowser();
				 driver.get(prop.getProperty("url")); 
				
				

			}
				
				 @Test(priority=1,groups= {"group1","group2"})
				 public void userLogin() throws Exception{
					 LoginPage l = new LoginPage(driver);
					 l.getDropdown().click();
					 l.getRegister().click();
					 l.getFirstName().sendKeys(prop.getProperty("FirstName"));
					 l.getLastName().sendKeys(prop.getProperty("LastName"));
					 l.getEmail().sendKeys(prop.getProperty("E-Mail"));
					 l.getCheckbox().click();
					 l.getButtonclick().click();
	
	
				 }
	

}
