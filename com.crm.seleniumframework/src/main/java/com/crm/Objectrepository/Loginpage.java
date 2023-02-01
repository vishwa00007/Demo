package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	

	//Declaration
	@FindBy(name="user_name")
	private WebElement ustbx;
	
	@FindBy(name="user_password")
	private WebElement pwtbx;
	
	@FindBy(id="submitButton")
	private WebElement subtn;
	
	
	public WebElement getUstbx() {
		return ustbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getSubtn() {
		return subtn;
	}
	/*
	 * this method is used to login the app
	 * @author vishwa
	 */
	public void login(String username,String password) 
	{
		ustbx.sendKeys(username);
		pwtbx.sendKeys(password);
		subtn.click();
	}
	
}
