package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.opencart.utils.BaseClass;

public class WishList extends BaseClass {
	
	
	public WebElement getComponents() {
		return components;
	}

	public WebElement getMonitors() {
		return monitors;
	}

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getAddtowishlist() {
		return addtowishlist;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement components;
	@FindBy(xpath="//a[contains(text(),'Monitors (2)')]")
	WebElement monitors;
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement sortby;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[2]")
	WebElement addtowishlist;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[2]")
	WebElement addtocart;
	
	public WishList() {

        PageFactory.initElements(driver, this);
    }
	
public void validateLoginDetails() {
     	
     	Actions act=new Actions(driver);
     	act.moveToElement(components).click().build().perform();
     }

}

