package com.opencart.tests;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class MainTest extends BaseClass {
	
		static ExtentTest test;
		static ExtentReports report;
		
		public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";
	 
		public MainTest() throws IOException{
			super();
			
		}
			
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
						 l.getLogin().click();
						 l.getEmailname().sendKeys(prop.getProperty("Emailname"));
						 l.getPassword().sendKeys(prop.getProperty("Password"));
						 l.getLoginClick().click();
						
	}
						 

						 @AfterClass
						 public void endTest()
						 {
						 report.endTest(test);
						 report.flush();
						 }
	

}
