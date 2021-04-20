package com.opencart.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.Add_to_Cart;
import com.opencart.pages.CreateAccount;
import com.opencart.pages.LoginPage;
import com.opencart.pages.OrderHistory;
import com.opencart.pages.Order_Placement;
import com.opencart.pages.WishList;
import com.opencart.utils.BaseClass;


public class ClassTest extends BaseClass{
	
	 public ClassTest() {
 
	 }
	 
	@BeforeTest
public void launchingBrowser()
{			
	initialization(); 
	}
	
	
	@Test
	public void createAccountDetails() throws Exception {
		
		CreateAccount obj= new CreateAccount();
	   
	    obj.getMyaccount().click();
	    obj.getRegister().click();
	    obj.getFirstname().sendKeys(prop.getProperty("FirstName"));
		obj.getLastname().sendKeys(prop.getProperty("LastName"));
		obj.getEmail().sendKeys(prop.getProperty("Email"));
	    obj.getPassword().sendKeys(prop.getProperty("Pass"));
	    obj.getConformpassword().sendKeys(prop.getProperty("conpass"));
	    obj.getTelephonenumber().sendKeys(prop.getProperty("Telephone"));
	    obj.getCheckbox().click();
	    obj.getContinuebtn().click();
	    
	    Thread.sleep(5000);
	    
	    LoginPage lp=new LoginPage();
	    lp.getMyaccount().click();
	    lp.getBtnlogin().click();
	    lp.getEmail().sendKeys(prop.getProperty("Email"));
	    lp.getPassword().sendKeys(prop.getProperty("Pass"));
	    lp.getLogin().click();
	    
	    Thread.sleep(5000);	
	    
	    Add_to_Cart ac=new Add_to_Cart();
	    ac.validateLoginDetails();
	    
	    ac.getMac().click();
	    ac.getProductcategory().click();
	    ac.getButtoncart().click();
	    ac.getMyaccount().click();
	    ac.getLogout().click();
	    
	    Thread.sleep(5000);
	    
	    
	    /*OrderHistory oh=new OrderHistory();
	    oh.getMyaccount().click();
	    oh.getBtnlogin().click();
	    Thread.sleep(1000);
	    oh.getOrderhistory().click();
	    oh.getView().click();
	    oh.getReturnbtn().click();
	    oh.getRadiobtn().click();*/
	    
	    WishList wl=new WishList();
	    wl.validateLoginDetails();
	    
	   wl.getMonitors().click();
	   wl.getSortby().click();
	   Select ob=new Select(wl.getSortby());
	   ob.selectByVisibleText("Price (High > Low)");
	   wl.getAddtowishlist().click();
	   wl.getAddtocart().click();
	   
	    
	}

}
