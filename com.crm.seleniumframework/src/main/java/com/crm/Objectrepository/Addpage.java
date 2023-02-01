package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addpage {
	
	//initialization
		public Addpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement paddlink;
	
	
	
	
	public WebElement getPaddlink() {
		return paddlink;
	}

	

	public  void productaddlink() 
	{
		paddlink.click();
	}
	
	
	
	

}
