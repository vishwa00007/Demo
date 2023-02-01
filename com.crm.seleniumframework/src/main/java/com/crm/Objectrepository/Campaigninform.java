package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigninform 
{
	//initialization
		public Campaigninform(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//initialisation
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement campinfo;

	public WebElement getCampinfo() {
		return campinfo;
	}
	
	

}
