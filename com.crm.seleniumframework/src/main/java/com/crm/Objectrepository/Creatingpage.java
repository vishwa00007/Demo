package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creatingpage 
{
	//initialization
			public Creatingpage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//declaration
			@FindBy(name="productname")
			private WebElement pnamebox;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement prosavebtn;

			public WebElement getPnamebox() {
				return pnamebox;
			}

			public WebElement getProsavebtn() {
				return prosavebtn;
			}
			
			
			
		
			
			
			
			
		
			
			
}
