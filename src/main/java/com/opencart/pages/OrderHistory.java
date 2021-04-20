package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory extends LoginPage{
	
	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public WebElement getOrderhistory() {
		return orderhistory;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getReturnbtn() {
		return returnbtn;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement btnlogin;
	@FindBy(xpath="//a[contains(text(),'View your order history')]")
	WebElement orderhistory;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]")
	WebElement view;
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[2]/i[1]")
	WebElement returnbtn;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[4]/div[1]/div[5]/label[1]")
	WebElement radiobtn;
	
	public OrderHistory() {

        PageFactory.initElements(driver, this);
    }
    
	

}
