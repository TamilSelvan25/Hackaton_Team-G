package com.opencart.tests;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.opencart.pages.CreateAccountPage;
import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class MainTest extends BaseClass {
	
		static ExtentTest test;
		static ExtentReports report;
		
		public String path = "\\Users\\SOUMYA\\eclipse-workspace\\Demo\\screenshot";
	 
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

					initialization();
					 driver.get(prop.getProperty("url")); 

				}
					
					 @Test(priority=1,groups= {"group1","group2"})
					 public void userLogin() {
						 
						 CreateAccountPage obj= new CreateAccountPage();
						   
						    obj.getMyaccount().click();
						    obj.getRegister().click();
						    obj.getFirstname().sendKeys(prop.getProperty("FirstName"));
							obj.getLastname().sendKeys(prop.getProperty("LastName"));
							obj.getEmail().sendKeys(prop.getProperty("Email"));
						    obj.getPassword().sendKeys(prop.getProperty("Password"));
						    obj.getConformpassword().sendKeys(prop.getProperty("conpass"));
						    obj.getTelephonenumber().sendKeys(prop.getProperty("Telephone"));
						    obj.getCheckbox().click();
						    obj.getContinuebtn().click();
						 
						 
						 
						 LoginPage obj1 = new LoginPage();
						 obj1.getMyaccount().click();
						 obj1.getBtnlogin().click();
						 obj1.getEmail().sendKeys(prop.getProperty("Email"));
						 obj1.getPassword().sendKeys(prop.getProperty("Password"));
						 obj1.getLogin().click();
						 
					 }

}
