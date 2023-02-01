package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaignaddbutton
{
	//initialization
			public Campaignaddbutton(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//img[@title='Create Campaign...']")
			private WebElement campaddlink;
			
			

			public WebElement getCampaddlink() {
				return campaddlink;
			}
			
			
			
			public  void campaignaddlink() 
			{
				campaddlink.click();
			}

		
}
