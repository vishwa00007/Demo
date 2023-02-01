package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productnameverification 
{
	
	//initialization
	public Productnameverification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement titleconfirm;

	public WebElement getTitleconfirm() {
		return titleconfirm;
	}
	
	
	
	

}
