package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationnameboxandsave 
{
	//initialization
	public Organisationnameboxandsave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(name="accountname")
	private WebElement orgnamebox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement orgsavebtn;

	public WebElement getOrgnamebox() {
		return orgnamebox;
	}

	public WebElement getOrgsavebtn() {
		return orgsavebtn;
	}
	
	/*
	 * this method is used to enter organisation name and save
	 * @author vishwa
	 */
	
	public void organisationname()
	{
		orgnamebox.click();
	}
	
	public void organisationsave()
	{
		orgsavebtn.click();
	}

}
