package com.opencart.selectitem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;
import com.opencart.utils.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class GuestCheckout extends BaseClass{
	
	static ExtentTest test;
	static ExtentReports report;
	public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";
	
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
				 public void selectAdd() throws Exception{
					 LoginPage l = new LoginPage(driver);
					 move(l.getMousehover());
					 l.getShowall().click();
					 l.getSelectitem().click();
					 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					 l.getAddToCart().click();
					 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					 l.getClickCart().click();
					 l.getCheckout().click();
					 l.getGuestCheckout().click();
					 l.getContinue().click();
					 l.getFirst().sendKeys(prop.getProperty("FirstName"));
					 l.getLast().sendKeys(prop.getProperty("LastName"));
					 l.getGuestEmail().sendKeys(prop.getProperty("E-Mail"));
					 l.getTelephone().sendKeys(prop.getProperty("Telephone"));
					 l.getAddress1().sendKeys(prop.getProperty("Address1"));
					 l.getCity().sendKeys(prop.getProperty("City"));
					 l.getPostCode().sendKeys(prop.getProperty("PostCode"));
					 Select dCountry= new Select(driver.findElement(By.name("Country")));
					 dCountry.selectByVisibleText("India");
					 screenShot(path+"\\screenshot.jpeg");
					 report.flush();
	
	

}
}


