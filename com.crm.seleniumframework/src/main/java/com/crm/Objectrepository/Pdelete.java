package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pdelete 

{

	//initialization
	public Pdelete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delete;

	public WebElement getDelete() {
		return delete;
	}
	
	public  void proddelete() 
	{
		delete.click();
	}
}
