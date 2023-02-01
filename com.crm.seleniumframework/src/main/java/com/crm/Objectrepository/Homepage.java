package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath="//a[text()='Products']")
	private WebElement prodlink;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[@href='javascript:;']")
	private WebElement morelink;
	
	@FindBy(name="Campaigns")
	private WebElement camplink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement confrmlink;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;

	public WebElement getProdlink() {
		return prodlink;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getMorelink() {
		return morelink;
	}
	
	public WebElement getCamplink() {
		return camplink;
	}

	public WebElement getConfrmlink() {
		return confrmlink;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	/*
	 * this is used to click on all the links in homepage
	 * @author vishwa
	 */
	public void productlink() 
	
	{
		System.out.println("product link clicked1");
		prodlink.click();
		
		System.out.println("product link clicked2");
	}
	public void Organisationlink() 
	{
		orglink.click();
	}
	public void campaignlink() 
	
	{System.out.println("product link clicked1");
		camplink.click(); 
		System.out.println("product link clicke21");
	}
	public void mrelink() 
	{
		morelink.click();
	}
	public void confirmlink()
	{
		confrmlink.click();
	}
	public void signot() 
	{
		signoutlink.click();
	}
}
