package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	final WebDriver driver;
	

	
	public LoginPage(WebDriver driver) {
		//super();
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement Dropdown;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Emailname;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement LoginClick;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement Register;

	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement FirstName;
	

    @FindBy(xpath="//input[@id='input-lastname']")
	private WebElement LastName;

	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Email;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement Checkbox;
	
	
    @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement Buttonclick;
    
   
	@FindBy(xpath="/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
   	private WebElement Mousehover;
	
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
   	private WebElement Showall;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/a[1]/img[1]")
   	private WebElement Selectitem;
	
	
	@FindBy(xpath="//button[@id='button-cart']")
   	private WebElement AddToCart;
	
	@FindBy(xpath="//span[@id='cart-total']")
   	private WebElement ClickCart;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
   	private WebElement Checkout;
	
	@FindBy(xpath="//input[@value='guest']")
   	private WebElement GuestCheckout;
	
	@FindBy(xpath="//input[@value='Continue']")
   	private WebElement Continue;
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	private WebElement First;
	

    public WebElement getFirst() {
		return First;
	}


	public WebElement getLast() {
		return Last;
	}


	@FindBy(xpath="//input[@id='input-payment-lastname']")
	private WebElement Last;
	
	@FindBy(xpath="//input[@id='input-payment-email']")
	private WebElement GuestEmail;
	
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	private WebElement Telephone;
	
	
	public WebElement getTelephone() {
		return Telephone;
	}


	public WebElement getGuestEmail() {
		return GuestEmail;
	}


	public WebElement getContinue() {
		return Continue;
	}


	public WebElement getGuestCheckout() {
		return GuestCheckout;
	}


	@FindBy(xpath="//input[@id='input-payment-company']")
   	private WebElement Company;
	
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
   	private WebElement Address1;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
   	private WebElement City;
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
   	private WebElement PostCode;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
   	private WebElement Country;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
   	private WebElement Region;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
   	private WebElement MouseComponent;
	
	@FindBy(xpath="//a[contains(text(),'Monitors (2)')]")
   	private WebElement Monitors;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
   	private WebElement AppleCinema;
	
	@FindBy(xpath="//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
   	private WebElement Checkbox3;
	
	@FindBy(xpath="//textarea[@id='input-option209']")
   	private WebElement Text;
	
	@FindBy(xpath="//button[@id='button-upload222']")
   	private WebElement UploadFile;
	
	@FindBy(xpath="//button[@id='button-cart']")
   	private WebElement FileAddtocart;
	
	public WebElement getFileAddtocart() {
		return FileAddtocart;
	}


	public WebElement getUploadFile() {
		return UploadFile;
	}


	public WebElement getText() {
		return Text;
	}


	public WebElement getSelect() {
		return select;
	}


	@FindBy(xpath="//select[@id='input-option217']")
   	private WebElement select;
	
	
	public WebElement getCheckbox3() {
		return Checkbox3;
	}


	public WebElement getAppleCinema() {
		return AppleCinema;
	}


	public WebElement getMonitors() {
		return Monitors;
	}


	public WebElement getMouseComponent() {
		return MouseComponent;
	}


	public WebElement getCompany() {
		return Company;
	}


	public WebElement getAddress1() {
		return Address1;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getPostCode() {
		return PostCode;
	}


	public WebElement getCountry() {
		return Country;
	}


	public WebElement getRegion() {
		return Region;
	}


	
	
	public WebElement getCheckout() {
		return Checkout;
	}


	public WebElement getShowall() {
		return Showall;
	}
	
	
	 public WebElement getClickCart() {
		return ClickCart;
	}


	public WebElement getMousehover() {
			return Mousehover;
		}


		public WebElement getAddToCart() {
			return AddToCart;
		}

	
	
	
	public WebElement getSelectitem() {
		return Selectitem;
	}


	public WebElement getButtonclick() {
		return Buttonclick;
	}
	

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	
	public WebElement getRegister() {
		return Register;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginClick() {
		return LoginClick;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}


	public WebElement getDropdown() {
		return Dropdown;
	}
	
	public WebElement getEmailname() {
		return Emailname;
	}
	

}
