package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utils.BaseClass;

public class LoginPage extends BaseClass{
	
	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement btnlogin;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement login;

	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}	

}
